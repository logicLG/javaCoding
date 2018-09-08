package dynamic;

import java.util.List;

/**
 * Created by Administrator on 2018/4/1 0001.
 */
public class minimumTotal {
    public int minimumTotal(List<List<Integer>> triangle) {
        int size=triangle.size();
        int[][] nums=new int[size][size];
        int min=Integer.MAX_VALUE;
        nums[0][0]=triangle.get(0).get(0);
        if(triangle.size()==1)
            return nums[0][0];
        if(triangle.size()>=2) {
            nums[1][0] = triangle.get(1).get(0)+nums[0][0];
            nums[1][1]=triangle.get(1).get(1)+nums[0][0];
        }
        for(int i=2;i<size;i++){
            for(int j=0;j<=i;j++){
                if(j==0)
                    nums[i][j]=triangle.get(i).get(j)+nums[i-1][j];
                else if(j==i)
                    nums[i][j]=triangle.get(i).get(j)+nums[i-1][j-1];
                else
                    nums[i][j]=triangle.get(i).get(j)+Math.min(nums[i-1][j-1],nums[i-1][j]);
            }
        }
        for(int j=0;j<size;j++){
            if(nums[size-1][j]<min)
                min=nums[size-1][j];
        }
        return min;
    }
}
