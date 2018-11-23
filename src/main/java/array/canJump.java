package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个非负整数数组，您最初位于数组的第一个索引处。

 数组中的每个元素表示您在该位置的最大跳跃长度。

 确定是否能够到达最后一个索引。

 示例：
 A = [2,3,1,1,4]，返回 true。

 A = [3,2,1,0,4]，返回 false。
 */
public class canJump {
    public  boolean canJump(int[] nums) {
        int size=nums.length;
        boolean [] canreach=new boolean[size];
        canreach[size-1]=true;
        int lastTrue=size-1;
        for(int i=size-2;i>=0;i--){
            if(nums[i]>=(lastTrue-i)){
                canreach[i]=true;
                lastTrue=i;
            }
            else canreach[i]=false;
        }
        if(canreach[0]==false)
            return false;
        else return true;
    }

    public static void main(String[] args) {
        canJump canJump=new canJump();
        int [] array={2,3,1,1,4};
        System.out.println(canJump.canJump(array));
    }

}
