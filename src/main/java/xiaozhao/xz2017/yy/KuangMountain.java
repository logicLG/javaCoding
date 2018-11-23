package xiaozhao.xz2017.yy;

import java.util.Scanner;

public class KuangMountain{
    class Inner{
        private void f(){
            System.out.println("f");
        }

    }

    public void mai() {
        (new Inner()).f(); //错误
    }

    public static void main(String[] args) {
        KuangMountain k=new KuangMountain();
        k.mai();
    }

}