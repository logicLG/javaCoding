package xiaozhao.xz2017;

import java.util.Scanner;

//航天飞行器是一项复杂而又精密的仪器，飞行器
//        的损耗主要集中在发射和降落的过程，科学
//        家根据实验数据估计，如果在发射过程中，
//        产生了 x 程度的损耗，那么在降落的过程中
//        就会产生 x2 程度的损耗，如果飞船的总损耗
//        超过了它的耐久度，飞行器就会爆炸坠毁。问一
//        艘耐久度为 h 的飞行器，假设在飞行过程中不产
//        生损耗，那么为了保证其可以安全的到达目的地，
//        只考虑整数解，至多发射过程中可以承受多少程度的损耗？
//        输入描述:
//        每个输入包含一个测试用例。每个测试用例包含一行一个整数 h （1 <= h <= 10^18）。
//        输出描述:
//        输出一行一个整数表示结果。
//        示例1
//        输入
//        复制
//        10
//        输出
//        复制
//        2
public class forth {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        long h=scn.nextLong();
        long result=0;
        long s=(long)Math.floor(Math.sqrt(h));
        for(long i=s;i>0;i--){
            if((i+Math.pow(i,2)<=h)){
                result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
