package dynamic;

/**
 * 机器人位于一个 m x n 网格的左上角, 在下图中标记为“Start” (开始)。

 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角，在下图中标记为“Finish”(结束)。

 问有多少条不同的路径？
 * Created by Administrator on 2018/4/1 0001.
 */
public class uniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] cache=new int[m+1][n+1];
        if(m==1&&n==1){
            return 1;
        }
        else if(m==1&&n==2||n==1&&m==2)
            return 1;
        else {
            cache[1][1]=1;
            if(m>1)
                cache[2][1]=1;
            if(n>1)
                cache[1][2]=1;
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(i==1&&j==2||j==1&&i==2)
                        continue;
                    cache[i][j]=cache[i][j-1]+cache[i-1][j];
                }
            }

        }
        return cache[m][n];
    }

    public static void main(String[] args) {
        uniquePaths uniquePaths=new uniquePaths();
        System.out.println(uniquePaths.uniquePaths(1,10));
    }

}
