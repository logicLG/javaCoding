package design;

import java.util.HashMap;

public class Client {

    public static void invoker(){
        //父类存在的地方，子类就应该能够存在
        Son f =new Son();
        HashMap map = new HashMap();
        f.doSomething(map); } public static void main(String[] args) { invoker(); }

    }