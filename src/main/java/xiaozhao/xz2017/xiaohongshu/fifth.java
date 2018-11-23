package xiaozhao.xz2017.xiaohongshu;

import design.state.LiftState;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*根据层序和中序生成后序*/
public class fifth {
    public  static String num1[];
    public static String num2[];
    public static List<String> list=new ArrayList<>();
    public static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        num2=s1.split(" ");//层序
        num1=s2.split(" ");//中序
        calc(0,num1.length-1,0,num2.length-1);
        System.out.println();
        for(String a:list){
            System.out.println(a);
        }
    }
    public static void calc(int l1,int r1,int l2,int r2)
    {
        int i,j=0;
        for(i=l2;i<=r2;i++)//找层次遍历中优先输出根节点的位置
        {
            int b=0;
            for(j=l1;j<=r1;j++)
            {
                if(num2[i].equals(num1[j]))
                {
                    count=0;
                    if(j>l1) calc(l1,j-1,0,r2);//遍历左子树
                    if(j<r1) calc(j+1,r1,0,r2);//遍历右子树
                    if(count==0){
                        list.add(num1[j]);
                    }
                    System.out.print(num1[j]+" ");//输出根节点
                    count++;
                    b=1;
                    break;
                }
            }
            if(b!=0) break;
        }

    }


}
