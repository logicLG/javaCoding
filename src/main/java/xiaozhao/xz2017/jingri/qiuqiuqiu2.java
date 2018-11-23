package xiaozhao.xz2017.jingri;

import java.util.Scanner;

public class qiuqiuqiu2 {
    static long dp[][][][]=new long[3][20][20][20];
    static boolean flag[][][][];
    static long result=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        flag=new boolean[3][n+1][m+1][k+1];
        for(int i=0;i<3;i++){
            dp[i][1][1][1]=2;
            dp[i][1][2][1]=1;
            dp[i][2][1][1]=1;
            dp[i][1][1][2]=1;

            dp[i][2][2][1]=2;
            dp[i][2][1][2]=2;
            dp[i][1][2][2]=2;
        }
        for(int index=0;index<3;index++){
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    for(int z=0;z<3;z++){
                        if(i==2&&j==2&&z==2)
                            continue;
                        flag[index][i][j][z]=true;
                    }
                }
            }
        }
        for(int i=0;i<=n;i++){
            for(int j=0;j<m;j++){
                for(int z=0;z<=k;z++){
                    if(i+j<z-1 || i+z<j-1 ||j+z<i-1){
                        for(int s=0;s<3;s++){
                            flag[s][i][j][z]=true;
                        }
                        continue;
                    }
                }
            }
        }

        dp[2][1][1][2]=4;
        dp[1][1][2][1]=4;
        dp[0][2][1][1]=4;


        dp[2][2][1][2] = 5;
        dp[2][1][2][2] = 5;

        dp[1][1][2][2] = 5;
        dp[1][2][2][1] = 5;

        dp[0][2][1][2] = 5;
        dp[0][2][2][1] = 5;



        System.out.println(getNumb(0,3,4,5));

    }
    public static long getNumb(int index,int i,int j,int z){
        if(index==2){
            if(flag[1][i][j][z-1]==true){
                result+=dp[1][i][j][z-1];
            }else {
                result+=getNumb(1,i,j,z-1);
            }
            if(flag[0][i][j][z-1]==true){
                result+=dp[0][i][j][z-1];
            }else {
                result+=getNumb(0,i,j,z-1);
            }
        }else if(index ==1){
            if(flag[2][i][j-1][z]==true){
                result+=dp[2][i][j-1][z];
            }else {
                result+=getNumb(2,i,j-1,z);
            }
            if(flag[0][i][j-1][z]==true){
                result+=dp[0][i][j-1][z];
            }else {
                result+=getNumb(0,i,j-1,z);
            }
        }else {
            if(flag[1][i-1][j][z]==true){
                result+=dp[1][i-1][j][z];
            }else {
                result+=getNumb(1,i-1,j,z);
            }
            if(flag[2][i-1][j][z]==true){
                result+=dp[2][i-1][j][z];
            }else {
                result+=getNumb(2,i-1,j,z);
            }
        }
        flag[index][i][j][z]=true;
        return result;
    }

}
