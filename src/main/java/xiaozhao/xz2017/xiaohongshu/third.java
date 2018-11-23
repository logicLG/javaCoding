package xiaozhao.xz2017.xiaohongshu;

import java.util.Scanner;

public class third {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(getNumber(num));
    }


    public static int getNumber(int n) {
        int number = 0;
        for(int i = 1; i <= n; i++){
            number += NumberOf1(i);
        }

        return number;
    }
    public static int NumberOf1(int n){
        int number = 0;

        while(n > 0){
            if(n % 10 == 1){
                number++;
            }
            n = n/10;
        }
        return number;
    }
}
