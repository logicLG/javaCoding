package backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*题目间87页ah算法*/
//5 4
//        0 0 1 0
//        0 1 0 0
//        0 0 1 0
//        0 1 0 0
//        0 0 0 1
//        3 2
//如果是向下和向上则可以使用动态规划，这里是四个方向所以使用dfs
public class Jiejiuxiaoha {
    private static int count=Integer.MAX_VALUE;
    private static int next[][]={{0,1},{1,0},{0,-1},{-1,0}};
    private static int finalX;
    private static int finalY;
    private static int n;
    private static int m;
    private static int [][]a;
    private static int [][]repeat;
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        a=new int[n][m];
        repeat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=scanner.nextInt();
            }
        }
        finalX=scanner.nextInt();
        finalY=scanner.nextInt();
        backTracking(0,0,0);
        System.out.println(count);

    }
    //repeat 回溯存储
    public static void backTracking(int x,int y,int step){
        if(x==finalX&&y==finalY){
            if(count>step)
                count=step;
            return;
        }
        int tx,ty;
        for(int i=0;i<4;i++){
            tx=next[i][0]+x;
            ty=next[i][1]+y;
            if(tx<0||tx>=n||ty<0||ty>=m)
                continue;
            if(a[tx][ty]==0&&repeat[tx][ty]==0){
                repeat[tx][ty]=1;

                backTracking(tx,ty,step+1);
//                list.remove(list.size()-1);
                repeat[tx][ty]=0;
            }
        }
    }
}
