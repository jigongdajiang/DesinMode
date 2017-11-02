package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 * 饿汉 也是在类加载过程中的初始化时实例创建
 */


public class Singleton_4 {
    private volatile static Singleton_4 mInstance = null;
    static {
        mInstance = new Singleton_4();
    }
    private Singleton_4(){

    }

    public static synchronized Singleton_4 getIntance(){
        return mInstance;
    }
}
