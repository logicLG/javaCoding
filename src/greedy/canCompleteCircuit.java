package greedy;

import java.lang.reflect.Array;

/**在一条环路上有 N 个加油站，其中第 i 个加油站有汽油gas[i]。

 你有一辆油箱容量无限的的汽车，从第 i 个加油站前往第 i+1 个加油站需要消耗汽油 cost[i]。你从其中一个加油站出发，开始时油箱为空。

 如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回-1。
 * Created by Administrator on 2018/4/12 0012.
 */
public class canCompleteCircuit {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gasSum=0;
        int cosSum=0;
        int flag=-1;
        for(int i=0;i<gas.length;i++){
            gasSum+=gas[i];
            cosSum+=cost[i];
        }
        if(gasSum<cosSum)
            return -1;
        else {
            int res[]=new int[gas.length];
            for(int i=0;i<gas.length;i++){
                res[i]=gas[i]-cost[i];
            }
            int sum=0;
            for(int i=0;i<gas.length;i++){
                sum=0;
                int j=i;int a=0;
                flag=i;
                for(;j<gas.length;j++){
                    sum=sum+res[j];
                    if(sum<0) {
                        flag=-1;
                        break;
                    }
                }
                if(flag==-1)
                    continue;
                for(;a<i;a++){
                    sum=sum+res[a];
                    if(sum<0){
                        flag=-1;
                        break;
                    }
                }
                if(flag!=-1)
                    break;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int []a=new int[]{1,2};
        int []b=new int[]{2,1};
        canCompleteCircuit s=new canCompleteCircuit();
        System.out.println(s.canCompleteCircuit(a,b));
    }
}
