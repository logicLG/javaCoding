package xiaozhao.xz2017;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TypeParameterTest
{
      //第一种声明：简单，灵活性低
      public static <T extends Comparable<T>> void mySort1(List<T> list)
     {
        Collections.sort(list);
     }

     //第二种声明：复杂，灵活性高
     public static <T extends Comparable<? super T>> void mySort2(List<T> list)
     {
         Collections.sort(list);
     }

     public static void main(String[] args)
     {
         List<Animal> animals = new ArrayList<Animal>();
         animals.add(new Animal(25));
         animals.add(new Dog(35));

         // 创建一个 Dog List
         List<Dog> dogs = new ArrayList<Dog>();
         dogs.add(new Dog(5));
         dogs.add(new Dog(18));

          // 测试  mySort1() 方法
          mySort1(animals);
//         mySort1(dogs);
     }


}
class Animal implements Comparable<Animal>{

    protected int name;
    public Animal(int name) {
        this.name=name;
    }
    public void setName(int name) {
        this.name = name;
    }
    @Override
    public int compareTo(Animal o) {
        // TODO Auto-generated method stub
        return 0;
    }
}
class Dog extends Animal{
    public Dog(int name){
        super(name);
    }

}
