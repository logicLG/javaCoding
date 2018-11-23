package xiaozhao.xz2017.jinri;

import java.util.Scanner;

class Outer{
    private class Inner{
        private int number=5;
        private void getA(){}
    }
    public int getNumber(){
        return new Inner().number;
    }
}
public class Hello {
    public static void main(String[] args){
        System.out.println(new Outer().getNumber());
    }
}