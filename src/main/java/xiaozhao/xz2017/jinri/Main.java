package xiaozhao.xz2017.jinri;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static int Solve(int[] a) {
        int result=0;
        result=result+a.length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length-1;i++){
            for(int j=i+2;j<a.length;j++){
                int flag=2;
                for(int s=i+1;s<j;s++){
                    if(a[s]>a[i]||a[s]>a[j]){
                        flag=flag-1;
                        break;
                    }
                }
                list.clear();
                for(int s=j+1;s<a.length;s++){
                    list.add(a[s]);
                }
                for(int s=0;s<i;s++){
                    list.add(a[s]);
                }
                for(Integer s:list){
                    if(s>a[i]||s>a[j]){
                        flag=flag-1;
                        break;
                    }
                }
                if(flag==0)
                    continue;
                else result++;
            }
        }
        return result-1;

    }
    static int getMax(int []a){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<a.length;i++){
            if(a[i]>max)
               max=a[i];
        }
        return max;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int res;
        int _a_size = 0;
        _a_size = Integer.parseInt(in.nextLine().trim());
        int[] _a = new int[_a_size];
        int _a_item;
        for(int _a_i = 0; _a_i < _a_size; _a_i++) {
            _a[_a_i] = in.nextInt();
        }
        res = Solve(_a);
        System.out.println(String.valueOf(res));
    }
}