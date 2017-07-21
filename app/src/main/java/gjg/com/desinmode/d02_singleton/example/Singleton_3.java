package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 *  懒汉 线程安全
 *  这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 */


public class Singleton_3 {
    private static Singleton_3 mInstance = null;
    private Singleton_3(){

    }
    public static synchronized Singleton_3 getIntance(){
        if(mInstance == null){
            mInstance = new Singleton_3();
        }
        return mInstance;
    }
}
