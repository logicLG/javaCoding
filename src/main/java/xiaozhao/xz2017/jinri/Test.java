package xiaozhao.xz2017.jinri;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        System.out.println(Test2.a);
        new Test2();
    }
}
class Test2{
    public static final String a="JD";
    static {
        System.out.println("OK");
    }
}
