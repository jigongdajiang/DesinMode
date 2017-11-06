package gjg.com.desinmode.d10_proxy.example.dynamicdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description: 动态代理对象
 */


public class ManInvocationHandler implements InvocationHandler {
    private IBank man;//被代理对象

    public ManInvocationHandler(IBank man) {
        this.man = man;
    }

    //每次调用目标接口的方法都会执行这里
    @Override
    public Object invoke(
            Object proxy,
            Method method,
            Object[] args) throws Throwable {
//        if(proxy != null){
//            System.out.println("proxy"+proxy.toString());
//        }
        if(method != null){
            System.out.println("method = "+method.toString());
        }
        if(null != args){
            for (Object arg : args) {
                System.out.println("arg = "+arg.toString());
            }
        }
        //调用被代理对象的方法
        System.out.println("受理业务");
        Object voidObject = method.invoke(man,args);
        System.out.println("结束业务");
        return voidObject;
    }
}
