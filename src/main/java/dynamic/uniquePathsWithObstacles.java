package dynamic;

import java.lang.reflect.Array;

/**
 * 这是“不同路径” 的进阶问题：

 现在考虑网格中有障碍物。那样将会有多少条不同的路径从左上角到右下角？

 网格中的障碍物和空位置分别用 1 和 0 来表示。

 例如，

 如下所示在 3x3 的网格中有一个障碍物。

 [
 [0,0,0],
 [0,1,0],
 [0,0,0]
 ]
 一共有 2 条不同的路径从左上角到右下角。
 * Created by Administrator on 2018/4/1 0001.
 */
public class uniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[m-1][n-1]==1||obstacleGrid[0][0]==1)
            return 0;
        int[][] cache=new int[m][n];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(obstacleGrid[i][j]==1) {
                    cache[i][j] = 0;
                    continue;
                }
                if(i==m-1&&j==n-1)
                    cache[i][j]=1;
                else if(i==m-1&&j!=n-1)
                    cache[i][j]=cache[i][j+1];
                else if(j==n-1&&i!=m-1)
                    cache[i][j]=cache[i+1][j];
                else cache[i][j]=cache[i+1][j]+cache[i][j+1];
            }
        }
        return cache[0][0];
    }
    public static void main(String[] args) {
        uniquePathsWithObstacles uniquePathsWithObstacles=new uniquePathsWithObstacles();
        int [][] a={{0}};
        System.out.println(uniquePathsWithObstacles.uniquePathsWithObstacles(a));
    }
}
