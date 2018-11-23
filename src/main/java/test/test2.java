package test;

public class test2 {
    public static void main(String[] args) {
        Dog dog=new Dog("tom");
        System.out.println(dog.toString());
        dog=new Dog("tom");
        System.out.println(dog.toString());
        System.out.println(dog.name);
    }
    public static void change(Dog dog){

    }
}
class Dog{
    public String name;
    public Dog(){

    }
    public Dog(String name){
        this.name=name;
    }
}
