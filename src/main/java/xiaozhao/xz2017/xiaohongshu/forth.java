package xiaozhao.xz2017.xiaohongshu;

import java.util.Scanner;

public class forth {
        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            System.out.println(getNum(n));
        }
    public static long  getNum(long n){
        if(n < 0 ){
            return 0;
        }
        long curr, low, temp, high = n, i = 1, total = 0;
        while(high!=0){
            high = n / get10Pow(i);
            temp = n % get10Pow(i);
            curr = temp / get10Pow(i-1);
            low = temp%get10Pow(i-1);
            if(curr == 1){
                total += high*get10Pow(i-1)+ low + 1;
            }else if(curr < 1){
                total += high*get10Pow(i-1);
            }else{
                total += (high + 1) * get10Pow(i-1);
            }
            i++;
        }
        return total;
    }
    public static long get10Pow(long i){
            return (long)Math.pow(10, i);
    }

}
