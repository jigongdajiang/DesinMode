package gjg.com.desinmode.d02_singleton.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/14
 * FileName:
 * @description:
 *  静态内部类
 *
 *  同样是通过类的加载来保证在初始化Instance时只有一个线程
 *  与普通饿汉的区别是，类被加载不一定不实例化。因为SingletonHolder
 *  没有被主动实用，只有显示的调用getInstance时，SingletonHolder才会
 *  被显示加载，从而实例化instance.
 *  想象一下，如果实例化instance很消耗资源，我想让他延迟加载，
 *  另外一方面，我不希望在Singleton类加载时就实例化，
 *  因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，
 *  那么这个时候实例化instance显然是不合适的。这个时候，这种方式相比普通饿汉方式就显得很合理。
 *  效率高，线程安全，懒加载（实例创建时还是不能太耗时）
 */


public class Singleton_5 {
    private static class SingletonHolder{
        private static final  Singleton_5 INSTANCE = new Singleton_5();
    }
    private Singleton_5(){}
    public static Singleton_5 getInstance(){
       return SingletonHolder.INSTANCE;
    }
}
