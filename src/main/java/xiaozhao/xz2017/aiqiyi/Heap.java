package xiaozhao.xz2017.aiqiyi;

import java.util.*;

public class Heap{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String data=scanner.nextLine();
        List<Integer>lists=new ArrayList<>();
        int sum1=0;
        int sum2=0;
        for(int i=0;i<data.length();i++){
            lists.add(Integer.parseInt(data.substring(i,i+1)));
            if(i<3){
                sum1+=Integer.parseInt(data.substring(i,i+1));
            }else{
                sum2+=Integer.parseInt(data.substring(i,i+1));
            }
        }
        if(sum1==sum2){
            System.out.println(0);
        }else {
            if (sum1 > sum2) {
                for (int i = 3; i < lists.size(); i++) {
                    lists.set(i, 9 - lists.get(i));
                }
            }
            else {
                for (int i = 0; i < 3; i++) {
                    lists.set(i, 9 - lists.get(i));
                }
            }



            int dt = Math.abs(sum1 - sum2);
            int num = 1;
            int tp = 0;
            for (int i = 0; i < lists.size(); i++) {
                tp += lists.get(i);
                if (tp > dt) {
                    break;
                }
                num++;
            }
            System.out.println(num);
        }
    }
}

