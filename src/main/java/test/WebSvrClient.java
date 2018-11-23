package test;


import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import org.apache.axis.utils.StringUtils;

import javax.xml.rpc.ServiceException;
import java.net.MalformedURLException;

/**
 * Created by zhangqq on 2016/8/29.
 */
public class WebSvrClient {

    public static void main(String[] args) {
        String url = "http://localhost:8080//services/example/HelloWorld";
        String method = "sayTitle";
        String[] parms = new String[]{"abc"};
        WebSvrClient webClient = new WebSvrClient();

        String svrResult = webClient.CallMethod(url, method, parms);

        System.out.println(svrResult);
    }

    public String CallMethod(String url, String method, Object[] args) {
        String result = null;

        if(StringUtils.isEmpty(url))
        {
            return "url地址为空";
        }

        if(StringUtils.isEmpty(method))
        {
            return "method地址为空";
        }

        Call rpcCall = null;


        try {
            //实例websevice调用实例
            Service webService = new Service();
            rpcCall = (Call) webService.createCall();
            rpcCall.setTargetEndpointAddress(new java.net.URL(url));
            rpcCall.setOperationName(method);

            //执行webservice方法
            result = (String) rpcCall.invoke(args);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }
}


