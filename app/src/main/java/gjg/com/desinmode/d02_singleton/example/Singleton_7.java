package gjg.com.desinmode.d02_singleton.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 * 容器方式
 * Android 框架使用的方式
 */


public class Singleton_7 {
    private static volatile Map<String,Object> mSingleMap = new HashMap<>();
    static {
        mSingleMap.put("activity_manager",new Singleton_7());
    }
    public static Object getService(String name){
        return mSingleMap.get(name);
    }
}
