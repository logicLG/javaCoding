package backtracking;

import array.LIS;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。

 例如，
 如果 n = 4 和 k = 2，组合如下：

 [
 [2,4],
 [3,4],
 [2,3],
 [1,2],
 [1,3],
 [1,4],
 ]
 * Created by Administrator on 2018/4/8 0008.
 */
public class combine {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtracking(result,list,n+1,k,1);
        return result;
    }
    //n 为输入数据 k为结束判断 list为回溯约束 start为回溯后往前更新
    public static void backtracking(List<List<Integer>> result,List list,int n,int k,int start){
        if(0==k){
            result.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<n;i++){
            list.add(i);
            backtracking(result,list,n,k-1,i+1);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        combine combine=new combine();
        List<List<Integer>> result=new ArrayList<>();
        result=combine.combine(9,3);
        System.out.println(result);
    }
}
