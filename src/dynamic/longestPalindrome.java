package dynamic;

/**最长回文
 * 给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 长度最长为1000。

 示例:

 输入: "babad"

 输出: "bab"

 注意: "aba"也是有效答案
 * Created by Administrator on 2018/3/31 0031.
 */
public class longestPalindrome {
    public String longestPalindrome(String s) {
        int length=s.length();
        boolean [][] boolPalindrome=new boolean[length][length];
        StringBuilder maxString=new StringBuilder();
        for(int i=0;i<length-1;i++){
            boolPalindrome[i][i]=true;
        }
        maxString.append(String.valueOf(s.charAt(0)));
        int flag=-1;
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                boolPalindrome[i][i+1]=true;
                flag=i;
            }
        }
        if(flag!=-1)
            maxString =new StringBuilder(String.valueOf(s.charAt(flag))+String.valueOf(s.charAt(flag+1)));
        int max=0;
        int maxlen=0;
        for(int len=3;len<=length;len++){
            for(int i=0,j;(j=len+i-1)<length;i++){
                if(s.charAt(i)==s.charAt(j)&&boolPalindrome[i+1][j-1]==true){
                    boolPalindrome[i][j]=true;
                    max=i;
                    maxlen=len;
                }
            }
        }
        if(maxlen>=2){
            maxString =new StringBuilder(s.substring(max,max+maxlen));
        }
        return maxString.toString();
    }

    public static void main(String[] args) {
        String s="jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmg";
        longestPalindrome lon=new longestPalindrome();
        System.out.println(lon.longestPalindrome(s));

    }
}
