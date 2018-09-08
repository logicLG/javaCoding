package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2018/3/29 0029.
 */
public class eightQueue {
    List<List<Integer>> result=new ArrayList<List<Integer>>();
    public static void main(String[] args) {

        eightQueue re=new eightQueue();
        re.result=re.combine(8,8);//从0到n-1列共选取k皇后
        System.out.println(re.result);

//        System.out.println(place(Arrays.asList(2)));
    }
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> list=new ArrayList<Integer>();
        backtracking(n,k,0,list);
        return result;
    }
    public void backtracking(int n,int k,int start,List<Integer>list){

         if(k==0) {
             result.add(new ArrayList(list));
             return;
         }
        else{
            for(int i=start;i<n;i++){
                list.add(i);//尝试性的加入i
                //开始回溯
                if(place(list)){
                    backtracking(n,k-1,0,list);
                    //递归返回后(只有成功才能返回)成功被加到result则需要删除最后成功的节点，然后再试他的旁节点
                    list.remove(list.size()-1);

                }
                else {
                    //停止这里的子树搜索，换父节点的旁节点前，需要先删掉没有用的子节点
                    list.remove(list.size()-1);
                    continue;
                }
            }
        }
    }
    public static boolean place(List<Integer> list){
        int size=list.size();
        for(int j=0;j<size-1;j++){
            if(Math.abs(j-size+1)==Math.abs(list.get(j)-list.get(size-1))||list.get(j)==list.get(size-1))
                return false;
        }
        return true;
    }
}
