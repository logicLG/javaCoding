package array;

import java.util.ArrayList;
import java.util.List;

/**
 * 给 n 对括号，写一个函数生成所有合适的括号组合。
 * Created by Administrator on 2018/3/28 0028.
 */
public class generateParenthesis {
    public static List<String> generateParenthesis(int n) {
        // Write your code here
        List<String> res = new ArrayList<String>();
        String item = new String();
        getgenerateParentList(res, item, n, 0, 0);
        return res;
    }

    public static void getgenerateParentList(List<String> res, String item,
                                      int n, int lge ,int rge) {
        if(lge==n){
            for(int i=0;i<n-rge;i++){
                item += ")";
            }
            res.add(new String(item));
            return;
        }
        getgenerateParentList(res, item+"(", n, lge+1, rge);
        if(lge>rge){
            getgenerateParentList(res, item+")", n, lge, rge+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(5));
    }
}
