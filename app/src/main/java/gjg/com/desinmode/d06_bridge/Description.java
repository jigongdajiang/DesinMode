package gjg.com.desinmode.d06_bridge;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 *  桥接
 */


public class Description {
    /**
     * 定义:
     *      将抽象部分和实现部分分离，是他们都能独立的变化
     * 场景:
     *      如果一个系统需要抽象化和实现化角色之间添加更多的灵活性，避免在两个层次之间建立静态的联系
     *      设计要求，实现化的角色的任何改变不应该影响客户端，或者实现化的角色的改变对客户端是完全透明的
     *      需要跨多个平台的图形和窗口体系上
     *      一个类存在两个独立变化的维度，且两个方向上都需要进行扩展
     *  角色:
     *      抽象化(Abstraction)角色:含有一个实现化的对象引用，定义的是基于实现化底层功能之上的操作
     *      实现化(Implementor)角色:给出的是实现的接口，而不是具体实现，该处应该只给出底层的操作定义
     *      修正抽象化(Refined Abstraction)角色:是抽象化的实现，对抽象化的定义进行了修正或者改变
     *      具体实现化(Concrete Implementor)角色:实现化角色接口的具体实现
     *  案例:
     *      两种方式绘制图形
     *  Android:
     *      ListView  和 BaseAdapter  就是桥接模式和适配器模式的结合使用
     */
}
