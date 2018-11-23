package design.strategy;

import sun.swing.BeanInfoUtils;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

//        Context context = new Context();
//
//        int result;
//
//        Strategy strategy;
//        Factory fac = new ConcreteFactory();
//        strategy = fac.create(AddStrategy.class);
//        context.setStrategy(strategy);
//        result = context.getResult(9, 3);
//        System.out.println(result);
        List a=new ArrayList<>();

        if(a instanceof List){
            System.out.println(1);
        };
        a.add("1");
        a.add(2);
        System.out.println(a);
    }
}
