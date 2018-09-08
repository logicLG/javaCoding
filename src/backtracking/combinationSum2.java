package backtracking;

import array.LIS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定候选号码数组 (C) 和目标总和数 (T)，找出 C 中候选号码总和为 T 的所有唯一组合。

 C 中的每个数字只能在组合中使用一次。

 注意:

 所有数字（包括目标）都是正整数。
 解决方案集不能包含重复的组合。


 例如，给定候选集合 [10, 1, 2, 7, 6, 1, 5] 和目标总和数 8，
 可行的集合是：

 [
 [1, 7],
 [1, 2, 5],
 [2, 6],
 [1, 1, 6]
 ]

 * Created by Administrator on 2018/4/8 0008.
 */
public class combinationSum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        if(candidates[0]>target) return result;
        int length=candidates.length;
        int sum=0;
        for(int i=0;i<length;i++){
            sum=sum+candidates[i];
        }
        if(sum<target)
            return result;
        List<Integer> list=new ArrayList<>();
        backtracking(result,list,candidates,target,0);
        return result;
    }
    public static void backtracking(List<List<Integer>> result,List<Integer> list,int[] candidateds,int target,int start){

        if(0==target){
            result.add(new ArrayList<>(list));
            return;
        }
        else if(0>target)
            return;
        else {
            int pre = -1;  //去重复
            for(int i=start;i<candidateds.length;i++) {
                if(candidateds[i] == pre)
                    continue;
                pre = candidateds[i];
                list.add(candidateds[i]);
                backtracking(result,list,candidateds,target-candidateds[i],i+1);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int[] array=new int[]{2};
        combinationSum2 com=new combinationSum2();
        List<List<Integer>> result=new ArrayList<>();
        result=com.combinationSum2(array,1);
        System.out.println(result);

    }
}
