package array;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class Container {
    public static int maxArea(int[] height) {
        int size=height.length;
        int max=Math.min(height[size-1],height[0])*(size-1);
        int left=0;
        int right=size-1;
        while(left<right){
            if(Math.min(height[right],height[left])*(right-left)>max)
                max=Math.min(height[right],height[left])*(right-left);
            if(height[left]<height[right])
                left++;
            else right--;
        }
        return max;

    }

    public static void main(String[] args) {
        int []a={2,3,4,5,18,17,6};
        System.out.println(maxArea(a));
    }
}
