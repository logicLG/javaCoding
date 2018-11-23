package backtracking;

import array.LIS;

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有可能的 k 个数，使其相加之和为 n，只允许使用数字1-9，并且每一种组合中的数字是唯一的。

 示例 1:

 输入: k = 3, n = 7

 输出：

 [[1,2,4]]


 示例 2:

 输入: k = 3, n = 9

 输出:

 [[1,2,6], [1,3,5], [2,3,4]]
 * Created by Administrator on 2018/4/9 0009.
 */
public class combinationSum3 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        if(n>k*9||n<k*1)
            return result;
        List<Integer> list=new ArrayList<>();
        backtracking(result,k,n,1,list);
        return result;
    }
    public static void backtracking(List<List<Integer>> result,int k, int n, int start, List<Integer> list){
        if(0==k) {
            if (n == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        if(n<=0){
            return;
        }
        for(int i=start;i<=9;i++){
            list.add(i);
            backtracking(result,k-1,n-i,i+1,list);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        combinationSum3 com=new combinationSum3();
        List<List<Integer>> result=new ArrayList<>();
        result= com.combinationSum3(3,9);
        System.out.println(result);

    }
}
