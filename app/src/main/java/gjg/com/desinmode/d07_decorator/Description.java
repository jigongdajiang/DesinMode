package gjg.com.desinmode.d07_decorator;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 装饰者模式
 */


public class Description {
    /**
     * 定义:
     *      动态的给一个对象添加额外的职责。就增加功能来说，Decorator模式相比生成子类更为灵活。该模式以对客户端透明的方式扩展对象的功能
     * 场景:
     *      在不影响其它对象的情况下，以动态、透明的方式给单个对象添加职责
     *      处理那些可以撤销的职责
     *      当不能采用生成子类的方法进行扩充时。一种情况是，可能有大量独立的扩展。另一种情况可能是因为类定义被隐藏，或类定义不能用于生成子类
     * 角色:
     *      被装饰对象基类(Component):定义一个对象接口，可以给这些对象动态添加职责
     *      具体被装饰对象(ConcreteComponent)
     *      装饰者抽象类(Decorator):维持一个指向Component实例的引用，并定义一个与Component一致的接口
     *      具体装饰对象(ConcreteDecorator):增加具体职责
     * 案例:
     *      见example
     * Android:
     *      Context ContextWrapper
     */
}
