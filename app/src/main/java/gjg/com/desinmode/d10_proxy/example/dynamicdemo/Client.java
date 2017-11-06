package gjg.com.desinmode.d10_proxy.example.dynamicdemo;

import java.lang.reflect.Proxy;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class Client {
    public static void main(String[] args){
        Man man = new Man("二妮");
        IBank bank = (IBank) Proxy.newProxyInstance(
                IBank.class.getClassLoader(),
                new Class[]{IBank.class},//目标接口Class数组
                new ManInvocationHandler(man) //代理器
        );
        bank.applyCard();
        bank.reportCard("621788277282");
    }
}
