package xiaozhao.xz2017.shunfeng;

import java.util.*;

public class first {
    static int count=0;
    static List<List<Integer>> relist=new ArrayList<>();
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String str=scn.nextLine();
        int length=str.split(",").length;
        List<Integer> list=new ArrayList<>();
        back(7,length,-1,-1,-1,list);
        System.out.println(count);

    }
    public static void back(int n,int length,int flag1,int flag2,int temp,List<Integer> list){
        if(n==0){
            count++;
            relist.add(new ArrayList<Integer>(list));
            return;
        }
        for(int i=0;i<length;i++){
            if(i==flag1||i==flag2)
                continue;
            temp=flag1;
            flag1=flag2;
            flag2=i;
            list.add(i);
            back(n-1,length,flag1,flag2,temp,list);
            flag2=flag1;
            flag1=temp;
            list.remove(list.size()-1);
        }
    }

}
