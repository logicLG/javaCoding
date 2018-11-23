package xiaozhao.xz2017.jingri;

import java.util.*;

public class qiuiquiqu {
    //static List<List<Integer>> resultList=new ArrayList<>();
    static long count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        List<Integer> list=new ArrayList<>();
        backTracking(n,m,k,-1);
        System.out.println(count);

        //System.out.println(resultList.size());
    }
    public static void backTracking(int n,int m,int k,int flag){
        if(n==0&&m==0&&k==0) {
            //resultList.add(new ArrayList<>(list));
            count++;
            return;
        }
        int temp=-1;
        for(int i=0;i<3;i++){
            if(flag==i)
                continue;
            if(i==0&&n!=0){
                temp=flag;
                flag=i;
//                list.add(i);
                n--;
                backTracking(n,m,k,flag);
                flag=temp;
                n++;
//                list.remove(list.size()-1);
            }
            if(i==1&&m!=0){
                temp=flag;
                flag=i;
//                list.add(i);
                m--;
                backTracking(n,m,k,flag);
                flag=temp;
               m++;
//                list.remove(list.size()-1);

            }
            if(i==2&&k!=0){
                temp=flag;
                flag=i;
//                list.add(i);
                k--;
                backTracking(n,m,k,flag);
                flag=temp;
               k++;
//                list.remove(list.size()-1);
            }
        }
    }
}
