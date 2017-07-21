package gjg.com.desinmode.d21_visitor;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 访问者模式
 */


public class Description {
    /**
     * 定义:
     *      表示一个作用于某对象结构中各元素的操作，它使你可以在不改变各元素类的前提下定义作用于这些元素的新操作
     *      从定义可以开出这个对象结构必须存在遍历自身各个元素对象的方法，例如Collection
     * 场景:
     *      对象有稳定的数据结构，又有易于变化的算法
     * 角色:
     *      访问者角色(Visitor):为该对象结构中具体元素声明一个访问操作接口
     *      具体访问者角色(ConcreteVisitor):
     *      元素角色(Element):定义一个accept操作，接收一个Visitor对象
     *      具体元素角色(ConcreteElement):
     *      对象结构角色(Object Structure):这是使用访问者模式的必备的角色,它有一下特征:能枚举它的元素;可以提供一个高层的
     *          接口允许该访问者能访问它的元素;可以是一个复合或者集合
     * 案例:
     *      医院付费、取药
     * android:
     *
     * 利弊:
     *      利:新增新的访问操作变简单
     *      弊:增加新元素难，破坏了封装
     */
}
