package shunxun;

/**给定一个字符串，找出不含有重复字符的最长子串的长度。

 示例：

 给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。

 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。

 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 * Created by Administrator on 2018/4/16 0016.
 */
public class lengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        char[] chars=s.toCharArray();
        if(chars.length==1)
            return 1;
        int maxlength=0;
        int indexfirst=0;
        int indexsecond=1;
        boolean flag=true;
        for(int i=0;i<chars.length;i++){
            flag=true;
            for(int j=i+1;j<chars.length;j++){
                for(int begin=i;begin<j;begin++){
                    if(chars[j]==chars[begin]){
                        if((j-begin)>maxlength) {
                            maxlength = j - begin;
                        }
                        flag=false;
                        indexfirst=begin;
                        indexsecond=j;
                        break;
                    }
                    if(begin==j-1){
                        if((j-i+1)>maxlength) {
                            maxlength = j-i+1;
                        }
                    }
                }
                if(flag==false)
                    break;
            }
//            if((indexfirst+1)<chars.length)
//                i=indexfirst+1;
//            if((indexsecond+1)<chars.length)
//                j=indexsecond+1;
        }
        return maxlength;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring s=new lengthOfLongestSubstring();
        String a="au";
        int result=s.lengthOfLongestSubstring(a);
        System.out.println(result);
    }
}
