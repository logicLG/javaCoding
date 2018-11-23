package xiaozhao.xz2017.baidu;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/9/26 0026.
 */
public class Main54  {
    //static String[] news=new String[]{"N","E","S","W","NE","SE","SW","NW"};
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        String temp="";
        int count=0;
        for(int i=0;i<input.length()-1;i++){
            temp=input.substring(i,i+2);
            if(temp.equals("NE")||temp.equals("SE")||temp.equals("SW")||temp.equals("NW")){
                count++;
            }
        }
        if(count==0) System.out.println(1);
        int result=1;
        for(int i=0;i<count;i++){
            result=result*2;
            if(result>1000000007){
                result=result%1000000007;
            }
        }
        System.out.println(result);
    }
}
