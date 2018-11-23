package bishi;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result[]=new int[n];
        for(int i=0;i<n;i++){
            int N=sc.nextInt();
            int M=sc.nextInt();
            if(N==0||M==0){
                result[i]=0;
                continue;
            }
            result[i]=getNum(N,M);
        }
        for(int res:result){
            System.out.println(res);
        }
    }
    public static int getNum(int row,int col){
        int result=0;
        if(row>=2&&col>=2){
            result=result+(row-2)*(col-2);
        }
        if(row==1&&col>=2){
            result=col-2;
        }
        if(col==1&&row>=2){
            result=row-2;
        }
        if(col==1&&row==1)
            result=1;
        return result;
    }
}
