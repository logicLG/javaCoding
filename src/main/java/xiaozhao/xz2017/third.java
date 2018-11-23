package xiaozhao.xz2017;

import java.util.Scanner;
import java.util.stream.Stream;

//n 只奶牛坐在一排，每个奶牛拥有 ai 个苹果，
//        现在你要在它们之间转移苹果，使得最后所
//        有奶牛拥有的苹果数都相同，每一次，你只能
//        从一只奶牛身上拿走恰好两个苹果到另一个奶牛
//        上，问最少需要移动多少次可以平分苹果，如果
//        方案不存在输出 -1。
//        输入描述:
//        每个输入包含一个测试用例。每个测试用例的第一行
//        包含一个整数 n（1 <= n <= 100），接下来的一行
//        包含 n 个整数 ai（1 <= ai <= 100）。
//        输出描述:
//        输出一行表示最少需要移动多少次可以平分苹果，如果方案不存在则输出 -1。
//        示例1
//        输入
//        复制
//        4
//        7 15 9 5
//        输出
//        复制
//        3
public class third {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int apple[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            apple[i]=scn.nextInt();
            sum=sum+apple[i];
        }
        if(sum%n!=0){
            System.out.println("-1");
            return;
        }
        int avg=sum/n;
        for(int i=1;i<n;i++){
            if(Math.abs(apple[i]-avg)%2!=0){
                System.out.println("-1");
                return;
            }
        }
        int sumApple=0;
        for(int i=0;i<n;i++){
            if(apple[i]>avg){
               sumApple=sumApple+apple[i]-avg;
            }
        }
        System.out.println(sumApple/2);

    }
}
