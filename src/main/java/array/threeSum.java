package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个包含 n 个整数的数组 S，是否存在属于 S 的三个元素 a，b，c
 * 使得 a + b + c = 0 ？找出所有不重复的三个元素组合使三个数的和为零。
 * Created by Administrator on 2018/3/28 0028.
 */
public class threeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        int size=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<size-2;i++){
            int left=i+1;int right=size-1;int sum=0-nums[i];
            if(i>=1&&nums[i]==nums[i-1])
                continue;
            while(left<right){
                if(nums[left]+nums[right]==sum){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while (left<right&&nums[left+1]==nums[left])left++;
                    while (left<right&&nums[right-1]==nums[right])right--;
                    left++;
                    right--;
                }
                else if(nums[left]+nums[right]>sum)
                    right--;
                else left++;
            }
        }return result;
    }

    public static void main(String[] args) {
        int []array={2,-3,0,-2,-5,-5,-4,1,2,-2,2,0,2,-4};

        System.out.println(threeSum(array));
    }


}
