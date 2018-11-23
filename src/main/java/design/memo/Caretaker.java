package design.memo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Caretaker {

//备忘录对象
    private IMemento memento;
    public IMemento getMemento() {

    return memento;
    } public void setMemento(IMemento memento) {

    this.memento = memento; }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException, IllegalAccessException {
        Originator originator = new Originator();
        Originator originator2 = new Originator();

        //定义出备忘录管理员
        Caretaker caretaker = new Caretaker();
        //创建两个备忘录
        IMemento memento=originator.createMemento();
        caretaker.setMemento(memento);


        //System.out.println(memento.getClass());
        Field f=memento.getClass().getDeclaredField("state");
        f.setAccessible(true);
        System.out.println(f.getName());
        f.set(memento,"2");
        System.out.println(f.get(memento));


        Method m1=memento.getClass().getDeclaredMethod("getState");
        Method m2=memento.getClass().getDeclaredMethod("setState", new Class[] { String.class });
        m1.setAccessible(true);
        m2.setAccessible(true);
        m1.invoke(memento);
        m2.invoke(memento,new String[]{"111"});
        m1.invoke(memento);




    }

}
