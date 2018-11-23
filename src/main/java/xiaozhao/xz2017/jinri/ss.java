package xiaozhao.xz2017.jinri;
import java.util.*;

public class ss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        List<String> lines = new ArrayList<>();
        while (sc.hasNext()){
            lines.add(sc.nextLine());
        }
        String nums = lines.get(0);
        int length  = nums.split(",").length;
        int size =  lines.size();

        String[][] matx = new String[size][length];
        String[][] temp = new String[size][length];
        for (int i = 0; i < size ; i++) {
            matx[i] = lines.get(i).split(",");
            temp[i] = lines.get(i).split(",");
        }
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < length; j++) {
                if(matx[i][j].equals("1"))
                    getNum(temp,i,j,k,size-1,length-1);
            }
        }
        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < length; j++) {
                if(temp[i][j].equals("0"))
                    temp[i][j] = "1";
                else
                    temp[i][j] = "0";
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print(temp[i][j]);
                if(j!=length-1)
                    System.out.print(",");
            }
            if(i!=size-1)
                System.out.println();
        }
    }
    public static void getNum(String[][] temp , int i , int j , int k , int row , int col) {
        if (k == 0)
            return;

        if (i - 1 >= 0 && !temp[i - 1][j].equals("-1")) {
            temp[i - 1][j] = "1";
            getNum(temp, i - 1, j, k - 1, row, col);
        }

        if (j + 1 <= col && !temp[i][j + 1].equals("-1")) {
            temp[i][j + 1] = "1";
            getNum(temp, i, j + 1, k - 1, row, col);
        }

        if (i + 1 <= row && !temp[i + 1][j].equals("-1")) {
            temp[i + 1][j] = "1";
            getNum(temp, i + 1, j, k - 1, row, col);
        }

        if (j - 1 >= 0 && !temp[i][j - 1].equals("-1")) {
            temp[i][j - 1] = "1";
            getNum(temp, i, j - 1, k - 1, row, col);
        }
    }
}
