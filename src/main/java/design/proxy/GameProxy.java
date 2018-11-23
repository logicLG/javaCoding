package design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class GameProxy implements InvocationHandler {
    Object obj;
    public  GameProxy(Object obj){
        this.obj=obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object value= method.invoke(obj,args);
        return value;
    }

    public static void main(String[] args) throws Exception {
//        IGamePlayer gamePlayer=new GamePlayer("zhang");
//        GameProxy gameProxy=new GameProxy(gamePlayer);
//        IGamePlayer proxy= (IGamePlayer) Proxy.newProxyInstance(gamePlayer.getClass().getClassLoader(),gamePlayer.getClass().getInterfaces(),
//                gameProxy);
//        proxy.login("zhang","111");
    }


}
