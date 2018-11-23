package xiaozhao.xz2017.jinri;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import java.util.Scanner;

/**
 * Created by Adminifirststrator on 2018/10/8 0008.
 */
public class first{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int k=scanner.nextInt();
        List<Integer> list=new ArrayList<>();
        for(int numA=0;numA<=k;numA++){
            int numB=k-numA;
            int sum=numA*a+numB*b;
            if(sumIsAAndB(sum,a,b)){
                list.add(numA);
            }
        }
        long res=0;
        for(Integer num:list){
            long s=1;
            for(int i=num+1;i<=k;i++){
                s=s*i;
                if(s>1000000007){
                    s=s%1000000007;
                }
            }
            res=res+s;
            if(res>1000000007){
                res=res%1000000007;
            }
        }
        System.out.println(res);
    }
    public static boolean sumIsAAndB(int sum,int a,int b){
        while (true){
            int s=sum%10;
            if(s!=a&&s!=b){
                return false;
            }
            sum=sum/10;
            if(sum==0)
                return true;
        }

    }

}