package xiaozhao.xz2017.xiaohongshu;


import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length-1;i++){
            int count=0;
            if(chars[i+1]==chars[i]) {
                while (i<chars.length-1&&chars[i + 1] == chars[i]) {
                    count++;
                    i = i + 1;
                }
                System.out.print(count +""+chars[i]);
            }
            else System.out.print(""+chars[i]);
        }
        if(chars[chars.length-1]!=chars[chars.length-2])
            System.out.print(""+chars[chars.length-1]);
    }
}
