package stack;

/**给定一个二叉树，返回其中序遍历。

 例如：
 给定二叉树 [1,null,2,3],

 1
 \
 2
 /
 3
 返回 [1,3,2].

 说明: 递归算法很简单，你可以通过迭代算法完成吗？
 * Created by Administrator on 2018/4/10 0010.
 */

import array.LIS;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class inorderTraversal {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        result.addAll(inorderTraversal(root.left));
        result.add(root.val);
        result.addAll(inorderTraversal(root.right));
        return result;
    }

    public List<Integer> inorderTraversal2(TreeNode root){
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null || stack.size()!=0){
            if(root!=null) {
                stack.push(root);
                root = root.left;
            }
            else {
                TreeNode curNode=stack.pop();
                result.add(curNode.val);
                root=curNode.right;
            }
        }
        return result;

    }

}
