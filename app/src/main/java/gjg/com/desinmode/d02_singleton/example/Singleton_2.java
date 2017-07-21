package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 *  懒汉线程不安全
 *  这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 */


public class Singleton_2 {
    private static Singleton_2 mInstance = null;
    private Singleton_2(){}
    public static Singleton_2 getInstance(){
        if(mInstance == null){
            mInstance = new Singleton_2();
        }
        return mInstance;
    }
}
