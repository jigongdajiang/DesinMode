package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 * 双重校验锁
 */


public class Singleton_8 {
    private static volatile Singleton_8 mInstance = null;
    private Singleton_8(){}
    public static Singleton_8 getInstance(){
        if(mInstance == null){
            synchronized (Singleton_8.class){
                if(mInstance == null){
                    mInstance = new Singleton_8();
                }
            }
        }
        return mInstance;
    }
}
