package other;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class first {
    public static List<List<Integer>> result=new ArrayList<>();
    public static Map<Integer,Integer> map=new HashMap<>();
    public static void main(String[] args) {
        int[] s=new int[]{2,3,4,5,6,7};

        map.put(6,9);
        map.put(7,8);
        map.put(3,7);
        map.put(5,5);
        map.put(4,4);
        map.put(2,1);
        Scanner scanner=new Scanner(System.in);
        int num=scanner.nextInt();
        int k=scanner.nextInt();

        List<Integer> list=new ArrayList<>();
        dfs(num,k,s,list);
        Set<List> set=new HashSet<>(result);
        System.out.println(set);
        int Min=Integer.MIN_VALUE;
        for(List l:set){
            if(setSum(l)>Min)
                Min=setSum(l);
        }
        System.out.println(Min);

    }
    public static void dfs(int num,int k,int []s,List<Integer> list){
        if(k==0){
            if(sum(list)==num){
                result.add(new ArrayList<>(list));
                return;
            }else return;
        }
        for(int i:s){
            list.add(i);
            dfs(num,k-1,s,list);
            list.remove(list.size()-1);
        }

    }
    public static int sum(List<Integer> list){
        int sum=0;
        for(int i:list){
            sum=sum+i;
        }
        return sum;
    }
    public static int setSum(List<Integer> list){
        int a[]=new int[6];
        for(int i:list){

        }
        return 1;
    }

}

