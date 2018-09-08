package stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一棵二叉树，返回其节点值的前序遍历。

 例如：
 给定二叉树[1,null,2,3]，

 1
 \
 2
 /
 3
 返回 [1,2,3]。

 注意: 递归方法很简单，你可以使用迭代方法来解决吗？
 * Created by Administrator on 2018/4/10 0010.
 */
public class preorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
 }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        if(root==null)
            return result;
        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));
        return result;
    }

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack=new Stack<>();
        while (root!=null||stack.size()!=0){
            result.add(root.val);

        }
        return result;
    }

}
