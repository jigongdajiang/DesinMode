package gjg.com.desinmode.d02_singleton;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 *  单利模式
 */


public class Description {
    /**
     * 定义:
     *      确保某个类只有一个实例
     *      能自行实例化
     *      能向整个系统提供这个实例
     * 应用场景:
     *      只需要一个实例，这个实例的创建往往比较耗资源
     * 写法:
     *      常规可以有七种写法，实际可归结为5中;
     *      饿汉，懒汉，枚举，双重校验锁,静态内部类
     * 在android中的应用:
     *      系统级别的服务，如LayoutInflater。会在ContextIml中进行注册，使用时通过getService(Context)获取单利对象
     * Example:
     *      主要是几种写法的灵活应用
     */
}
