package xiaozhao.xz2017.xunlei;
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public  class MaxHeap
{
    private static MaxHeap example=new MaxHeap();
    private static Map<Integer,Boolean> test=new HashMap<Integer,Boolean>();
    private MaxHeap(){
        test.put(1,true);
    }
    public static MaxHeap getInstance(){
        return example;
    }

    public static void main(String[] args) {
        MaxHeap.getInstance();
    }
}
