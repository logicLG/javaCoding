package xiaozhao.xz2017.xunlei;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {


    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/
    static List findDisappearedNum(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0 ; i != nums.length ; i++) {
            nums[Math.abs(nums[i])-1] = -Math.abs(nums[Math.abs(nums[i])-1]);
        }
        for (int i = 0 ; i != nums.length; i++) {
            if (nums[i] >= 0) res.add(i+1);
        }
        return res;

    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        List<Integer> res;

        int _nums_size = 0;
        _nums_size = Integer.parseInt(in.nextLine().trim());
        int[] _nums = new int[_nums_size];
        int _nums_item;
        for(int _nums_i = 0; _nums_i < _nums_size; _nums_i++) {
            _nums_item = Integer.parseInt(in.nextLine().trim());
            _nums[_nums_i] = _nums_item;
        }
        res = findDisappearedNum(_nums);
        for(Integer a:res)
            System.out.println(a);

    }
}