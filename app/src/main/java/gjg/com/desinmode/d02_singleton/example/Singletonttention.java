package gjg.com.desinmode.d02_singleton.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 */


public class Singletonttention {
    /**
     * 1、如果单例由不同的类装载器装入，那便有可能存在多个单例类的实例。
     *    假定不是远端存取，例如一些servlet容器对每个servlet使用完全
     *    不同的类  装载器，这样的话如果有两个servlet访问一个单例类，
     *    它们就都会有各自的实例。
     * 2、如果Singleton实现了java.io.Serializable接口，那么这个类
     *    的实例就可能被序列化和复原。不管怎样，如果你序列化一个单例类的
     *    对象，接下来复原多个那个对象，那你就会有多个单例类的实例。
     */

    /**
     * 问题1的修复方法
     *
     * @param classname
     * @return
     */
    private static Class getClass(String classname) throws ClassNotFoundException {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        if (classLoader == null)
            classLoader = Singleton_7.class.getClassLoader();

        return (classLoader.loadClass(classname));
    }

    /**
     * 问题2的修复方法
     */
     public static class Singleton implements java.io.Serializable {
       public static Singleton INSTANCE = new Singleton();
        protected Singleton() {

       }
        private Object readResolve() {
                return INSTANCE;
          }
    }

    /**
     * 通过注册过的获取
     * 例如系统的LayoutInflator等服务就是在加载是通过静态代码块
     * 我们使用时通过get(key)方式获取服务
     *
     */
     private static Map<String, Singleton> objMap = new HashMap<>();

     /**
     * 注册对象到map中
     * @param key
     * @param instance
     */
    public static void registerService(String key, Singleton instance) {
        if (!objMap.containsKey(key) ) {
            objMap.put(key, instance) ;
        }
    }

    /**
     * 根据key获取对象
     * @param key
     * @return
     */
    public static Singleton getService(String key) {
        return objMap.get(key) ;
    }
}
