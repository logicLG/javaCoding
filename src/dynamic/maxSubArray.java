package dynamic;

/**
 * Created by Administrator on 2018/3/31 0031.
 */
public class maxSubArray {
    public int maxSubArray(int[] nums) {
        int length=nums.length;
        int sum=nums[0];
        int tmpnum=0;
        for(int i=0;i<length;i++){
            tmpnum+=nums[i];
            if(tmpnum>sum){
                sum=tmpnum;
            }
            if(tmpnum<=0) {
                tmpnum = 0;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a={-3,-2,0,-1};
        maxSubArray max=new maxSubArray();
        System.out.println(max.maxSubArray(a));
    }
}
