package shunxun;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：

 P   A   H   N
 A P L S I I G
 Y   I   R
 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"

 实现一个将字符串进行指定行数变换的函数:

 string convert(string text, int nRows);
 示例 1:

 输入: s = "PAYPALISHIRING", numRows = 3
 输出: "PAHNAPLSIIGYIR"
 示例 2:

 输入: s = "PAYPALISHIRING", numRows = 4
 输出: "PINALSIGYAHRPI"
 解释:

 P     I    N
 A   L S  I G
 Y A   H R
 P     I
 * Created by Administrator on 2018/4/17 0017.
 */
public class convert {
    public String convert(String s, int numRows) {
        int length=s.length();
        int firstlineNum=numCol(length,numRows);
        int [][]numArray=new int[numRows][firstlineNum];
        for(int i=0;i<length;i++){
            int n=numCol(i+1,numRows);
            int m=(numRows-1)-n%(numRows-1);
            System.out.println(n);
            //System.out.println(m);
        }
        return null;
    }
    public static int numCol(int length,int numRows){
        int firstlineNum=(length-1)/(numRows+numRows-2)+1;
        int res=(length-1)%(numRows+numRows-2);
        if(res>numRows)
            firstlineNum=((firstlineNum-1)*(numRows-1)+1)+res-numRows+1;
        else firstlineNum=(firstlineNum-1)*(numRows-1)+1;
        return firstlineNum;

    }
    public static void main(String[] args) {
        convert con=new convert();
        con.convert("PAYPALISHIRI",4);
    }
}
