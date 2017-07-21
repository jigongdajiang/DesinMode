package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 * 双重校验锁
 */


public class Singleton_7 {
    private static volatile Singleton_7 mInstance = null;
    private Singleton_7(){}
    public static Singleton_7 getInstance(){
        if(mInstance == null){
            synchronized (Singleton_7.class){
                if(mInstance == null){
                    mInstance = new Singleton_7();
                }
            }
        }
        return mInstance;
    }
}
