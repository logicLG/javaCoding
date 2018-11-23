package design.observer;

import java.util.Observable;
import java.util.Observer;

public class LiSi implements Observer {
    @Override
    public void update(Observable o, Object obj) {
        System.out.println("李斯：观察到韩非子活动，开始向老板汇报了...");

        this.reportToQinShiHuang(obj.toString());

        System.out.println("李斯：汇报完毕...\n");
    }
    //汇报给秦始皇
    private void reportToQinShiHuang(String reportContext){

        System.out.println("李斯：报告，秦老板！韩非子有活动了--->"+reportContext);
    }
}
