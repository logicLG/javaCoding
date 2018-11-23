package stack;

import java.util.Stack;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public class dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result=new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            for(int j=i+1;j<temperatures.length;j++){
                if(result[i]>=0){
                    if((temperatures[j]-temperatures[i])>0){
                        result[i]=i-j;
                        break;
                    }

                }
            }
        }
        for(int i=0;i<result.length;i++){
            if(result[i]<0)
                result[i]=-result[i];
            else
                result[i]=0;
        }
        return result;
    }
    public int[] dailyTemperatures2(int[] temperatures) {
        int [] result=new int[temperatures.length];
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<temperatures.length;i++){
            if(stack.size()==0||temperatures[i]<temperatures[stack.peek()] ){
                stack.push(i);
            }
            else{
                while(stack.size()!=0&&temperatures[i]>temperatures[stack.peek()]){
                    result[stack.peek()]=i-(stack.peek());
                    stack.pop();
                }
                stack.push(i);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int [] result=new int[]{64,40,49,73,72,35,68,83,35,73,84,88,96,43,74,63,41,95,48,46,89,72,34,85,72,59,87,49,30,32,47,34,74,58,31,75,73,88,64,92,83,64,100,99,81,41,48,83,96,92,82,32,35,68,68,92,73,92,52,33,44,38,47,88,71,50,57,95,33,65,94,44,47,79,41,74,50,67,97,31,68,50,37,70,77,55,48,30,77,100,31,100,69,60,47,95,68,47,33,64};
        int []tem=new int[result.length];
        dailyTemperatures da=new dailyTemperatures();
        tem=da.dailyTemperatures2(result);
        System.out.println(tem);
    }
}
