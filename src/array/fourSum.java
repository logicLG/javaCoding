package array;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by Administrator on 2018/3/27 0027.
 */
public class fourSum {

      public static List<List<Integer>> fourSum(int[] nums, int target) {
          List<List<Integer>> result=new ArrayList<>();

          int size=nums.length;
          if(size==0){
                return result;
          }
          if(size<4){
              int sum=0;
              for(int i=0;i<nums.length;i++){
                  sum=nums[i];
              }
              if(sum==target){
                  List<Integer> ls=new ArrayList<>();
                  for(int i=0;i<nums.length;i++){
                      ls.add(nums[i]);
                  }
                  result.add(ls);
                  return result;
              }
          }

          int[] array=new int[size*(size-1)/2];
          int index=0;

          Map<Integer,List<Integer>> map=new HashMap<>();
          for(int i=0;i<size-1;i++){
              for(int j=i+1;j<size;j++){
                  List<Integer> list=new ArrayList<>();
                  array[index] = nums[i] + nums[j];
                  if(!map.containsKey(array[index])) {
                      list.add(i);
                      list.add(j);
                      map.put(array[index],list);
                  }
                  else {
                      list=map.get(array[index]);
                      list.add(i);
                      list.add(j);
                      map.put(array[index],list);
                  }
                  index++;
              }
          }
          Arrays.sort(array);
          int sum=0;
          int auxtarget=0;
          for(int i=0;i<size-1;i++){
              for(int j=i+1;j<size;j++){
                  sum=nums[i]+nums[j];
                  auxtarget=target-sum;
                  int flag=biSearch(array,auxtarget);
                  if(flag!=-1){
                        List<Integer> ls=map.get(auxtarget);
                        ArrayList<Integer> list1=(ArrayList<Integer>)((ArrayList<Integer>)ls).clone();
                        while (list1.size()>=2){
                            List<Integer> list=new ArrayList<>();
                            if(list1.get(0)==i||list1.get(1)==j||list1.get(0)==j||list1.get(1)==i){
                                list1.remove(1);
                                list1.remove(0);
                                continue;
                            }
                            list.add(nums[list1.get(0)]);
                            list.add(nums[list1.get(1)]);
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list1.remove(1);
                            list1.remove(0);
                            result.add(list);
                        }


                  }
              }
          }
          List<List<Integer>> resultfinal=listquchong(result);
          return resultfinal;



      }
    public static List<List<Integer>> listquchong(List<List<Integer>> result){
        List<List<Integer>> resultfinal=new ArrayList<>();
          HashMap<Set<Integer>,List<Integer>> map=new HashMap<>();
          for(List<Integer> ls:result){
              Set<Integer> key=new HashSet<>(ls);
              if(!map.containsKey(key)){
                  map.put(key,ls);
              }

          }
          for(Map.Entry<Set<Integer>,List<Integer>> entry:map.entrySet())
            resultfinal.add(entry.getValue());
        return resultfinal;
    }
    public static void main(String[] args) {
        int[] a={1,0,-1,0,-2,2};
        List<List<Integer>> s=fourSum(a,0);
        System.out.println(s);
    }
    public static int biSearch(int []array,int a){
        int le=0;
        int ri=array.length-1;
        int mid;
        while(le<ri){
            mid=(le+ri)/2;
            if(array[mid]==a){
                return mid;
            }
            else if(array[mid]>a){
                ri=mid-1;
            }
            else{
                le = mid + 1;
            }

        }
        return -1;
    }
}
