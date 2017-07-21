package gjg.com.desinmode.d04_prototype;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 原型模式
 */


public class Description {
    /**
     * 定义:
     *      用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
     * 场景:
     *      类的初始化，资源消耗大
     *      通过new对象比较繁琐
     *      一个对象需要提供给其它对象访问，而且各个调用者都有可能修改其值
     * 角色:
     *      Client:客户端
     *      Prototype:抽象类或接口，声明具备Clone的能力
     *      ConcretePrototype:具体实现
     * 案例:
     *      集成在Cloneable的文档对象拷贝
     * Android:
     *      Intent.clone
     * 利弊:
     *      利:二进制流拷贝创建对象，性能高
     *      弊:内存拷贝不会执行构造方法
     */
}
