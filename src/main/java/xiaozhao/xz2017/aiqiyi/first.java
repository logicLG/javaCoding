package xiaozhao.xz2017.aiqiyi;


import java.util.*;

public class first  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        while (sc.hasNextInt()){
            list.add(sc.nextInt());
        }
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:list){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else {
                map.put(i,map.get(i)+1);
            }
        }
        int max=0;
        int value=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                value=entry.getKey();
            }
        }
        System.out.println("value = "+value+"  "+"count = "+max);
    }


}


