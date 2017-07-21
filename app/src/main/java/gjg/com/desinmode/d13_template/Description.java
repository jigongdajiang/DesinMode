package gjg.com.desinmode.d13_template;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *      模板方法模式
 */


public class Description {
    /**
     * 定义：
     *      定义一个操作中的算法框架，而将一些子步骤延迟到子类
     * 场景:
     *      1.多个类中有公用的方法，并且逻辑基本相同
     *      2.重要、复杂的算法，可以把核心算法作为模板方法，周边细节交由子类实现
     *      3.重构时，对相同的进行抽象，然后用钩子方法结束其行为
     * 角色:
     *      AbsTemplate:抽象模板方法类
     * 案例:
     *      电脑的启动
     * android中的应用:
     *      AsyncTask，Activity的生命周期
     * 利弊:
     *      利:封装不变，扩展可变；代码复用
     *      弊:不利阅读
     */
}
