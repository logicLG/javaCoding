package xiaozhao.xz2017.jinri;

public class Main2 {
    public static void main(String[] args) {
        System.out.println(fun1());
    }
    public static String fun1(){
        try{
            System.out.println("A");
            return fun2();
        }finally {
            System.out.println("B");
        }
    }
    public static String fun2(){
        System.out.println("C");
        return "D";
    }
}
