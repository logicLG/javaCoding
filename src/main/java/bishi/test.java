package bishi;

import java.sql.SQLOutput;
import java.util.Scanner;

class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class orange extends Fruit{}
public class test {
    public static void main(String[] args) {
        Fruit[] fruit=new Apple[10];
        fruit[0]=new Apple();
        fruit[1]=new Jonathan();
        try{
            fruit[0]=new Fruit();
            System.out.println("add Fruit");
        }catch (Exception e){
            System.out.println("cant put");

        }
        try{
            fruit[0]=new orange();
            System.out.println("add org");
        }catch (Exception e){
            System.out.println("cant put or");
        }
    }

}
