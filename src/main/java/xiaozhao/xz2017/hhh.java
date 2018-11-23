package xiaozhao.xz2017;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hhh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]==0)
                arr[i]=1;
            else {
                break;
            }
        }
        for(int i=n-1;i>0;i--) {
            if (arr[i] == 0) {
                arr[i] = 1;
            }else break;
        }
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                int count=0;
                while (arr[i]==0&&i<n){
                    count++;
                    i=i+1;
                }
                list.add(count+1);
            }
        }
        int result=1;
        for(int i:list){
            result=result*i;
        }
        System.out.println(result);

    }

}
