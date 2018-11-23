package xiaozhao.xz2017.aiqiyi;

import java.util.Scanner;

public class second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String string=sc.next();
        int [] num=new int[6];
        for(int i=0;i<6;i++){
            num[i]=string.charAt(i)-48;
        }
        int sum1=0;
        int sum2=0;
        for(int i=0;i<3;i++){
            sum1=sum1+num[i];
        }
        for(int i=3;i<6;i++){
            sum2=sum2+num[i];
        }
        int del=Math.abs(sum1-sum2);
        if(del==0){
            System.out.println(0);
            return;
        }

        if(sum1>sum2) {
            for (int i = 0; i < 3; i++) {
                int temp = num[i];
                num[i] = num[i + 3];
                num[i + 3] = temp;
            }
        }

        int count=0;
        while(true) {
            int tempMax=getMax(num[3],num[4],num[5]);
            int tempMin=9-getMin(num[0],num[1],num[2]);
            if (tempMax > tempMin) {
                if (del <= tempMax) {
                    count++;
                    System.out.println(count);
                    return;
                } else {
                    del = del - tempMax;
                    for (int i = 0; i < 3; i++) {
                        if (num[i] == tempMax)
                            num[i] = 0;
                    }
                    count++;
                }
            } else {
                if (del <= tempMin) {
                    count++;
                    System.out.println(count);
                    return;
                } else {
                    count++;
                    del = del - tempMin;
                    for (int i = 3; i < 6; i++) {
                        if (num[i] == tempMin)
                            num[i] = 9;
                    }
                }
            }
        }

    }
    public static int getMin(int x,int y,int z){
        int min=x;
        if(y<min){
            min=y;
        }
        if(z<min)
            min=z;
        return min;
    }
    public static int getMax(int x,int y,int z){
        int max=x;
        if(y>max){
            max=y;
        }
        if(z>max)
            max=z;
        return max;
    }
}
