package gjg.com.desinmode.d05_flyweight;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 享元模式
 */


public class Description {
    /**
     * 定义:
     *      共享元对象
     *      内蕴状态:
     *          存储在享元对象内部，并且不会随环境的改变而有所不同。因此，一个享元可以具有内蕴状态并可以共享
     *      外蕴状态:
     *          随环境改变不可共享，不影响内蕴状态
     * 场景:
     *      如果一个系统中存在多个相同的对象，那么只需要共享一份拷贝，而不用为每一次使用都创建新的对象
     * 角色:
     *      单纯享元模式:
     *          抽象享元角色(Flyweight):抽象接口，规定所有具体享元角色所需要实现的方法
     *          具体享元角色(ConcreteFlyweight):实现接口，如果有内蕴状态的话必须负责为内蕴状态提供存储空间
     *          享元工厂角色(FlyweightFactory):负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当的共享
     *      复合享元模式:
     *          描述:
     *              将一些单纯的享元使用合成的方式加以复合，形成复合享元对象。复合享元对象本身不能共享，但是可以分解为可以共享的单纯享元对象
     *
     *          抽象享元角色(Flyweight):抽象接口，规定所有具体享元角色所需要实现的方法
     *          具体享元角色(ConcreteFlyweight):实现接口，如果有内蕴状态的话必须负责为内蕴状态提供存储空间
     *          复合享元角色(ConcreteCompositeFlyweight):本身不能共享。可分解
     *          享元工厂角色(FlyweightFactory):负责创建和管理享元角色。本角色必须保证享元对象可以被系统适当的共享
     * 案例:
     *      example
     * android:
     *      String设计采用的就是享元模式  表现为 String a = "abc";String b="abc" a.equals(b) = true
     * 利弊:
     *      利:大幅度降低内存中对象的数量，也是设计模式中针对性能的一种模式
     *      弊:导致系统复杂，状态外部化使得读取外部状态变的运行时间变长
     */
}
