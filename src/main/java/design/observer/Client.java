package design.observer;

import java.io.BufferedReader;

public class Client {
    public static void main(String[] args) {
        IHanFeiZi HanFeiZi=new HanFeiZi();
        ((HanFeiZi) HanFeiZi).addObserver(new LiSi());
        HanFeiZi.haveBreakfast();
        HanFeiZi.haveFun();

    }
}
