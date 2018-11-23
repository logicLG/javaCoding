package array;

/**
 * 给定一个已经升序排序的整形数组，找出给定目标值的开始位置和结束位置。

 你的算法时间复杂度必须是 O(log n) 级别。

 如果在数组中找不到目标，返回 [-1, -1]。

 例如:
 给出 [5, 7, 7, 8, 8, 10] 和目标值 8，
 返回 [3, 4]。
 * Created by Administrator on 2018/3/30 0030.
 */
public class searchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result=new int[2];
        int size=nums.length;
        int low=0;int height=size-1;
        int middle=(height-low)/2;
        int resultLow=-1;
        int resultHigh=-1;
        boolean flag=false;

        while(low<=height){
            if(nums[middle]==target) {
                flag=true;
                break;
            }
            else if(nums[middle]>target){
                height=middle-1;
            }
            else low=middle+1;
            middle=(height+low)/2;
         }
         if(flag==true){
            resultLow=middle;
            resultHigh=middle;
            int i=middle;
            int j=middle;
            while (i>=1&&nums[--i]==nums[middle]){
                resultLow=i;
            }
            while (j<size-1&&nums[++j]==nums[middle]){
                 resultHigh=j;
             }
             result[0]=resultLow;
            result[1]=resultHigh;
            return result;
         }
         else {
             result[0]=-1;
             result[1]=-1;
             return result;
         }
    }

    public static void main(String[] args) {
        int []a={2};
        searchRange s=new searchRange();
        int[] result=s.searchRange(a,2);
        System.out.println(result[0]+""+result[1]);
    }
}
