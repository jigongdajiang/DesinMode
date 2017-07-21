package gjg.com.desinmode.d03_builder;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 *  建造者模式
 */


public class Description {
    /**
     *  定义:
     *      将一个复杂的对象的构建与它的表示分离
     *      使得同样的构建过程可以创建出不同的表示
     *  使用场景:
     *      1.相同的方法，不同的执行顺序，产生的不同的事件结果时
     *      2.多个部件或零件，都可以装到一个对象中，但是产生的运行结果又不相同时
     *      3.产品类很复杂，或者产品类的调用顺序不同产生了不同的效能时
     *  角色:
     *      Product:产品类
     *      Builder:规范产品的组建，提供零部件设置方法，一般为抽象类
     *      ConcreteBuilder:具体的构建起
     *      Director:统一组装器(可省略，一般由Builder的build来完成即可)
     *  特殊说明:
     *      该模式拓展性等都比较好，但是会产生多余的Builder对象，还有就是构建过程是暴露的
     *  在Android中的应用:
     *      AlertDialog
     *  Example：
     *      电脑的组装
     *
     *
     */
}
