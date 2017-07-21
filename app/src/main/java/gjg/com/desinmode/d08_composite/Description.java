package gjg.com.desinmode.d08_composite;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 组合模式
 */


public class Description {
    /**
     * 定义:
     *      又称作部分-整体模式，它模糊了属性结构中简单元素和复杂元素的概念。具体的定义:
     *      将对象组合成树形结构以表示"部分-整体"的层次结构，使得用户对单个对象和组合对象的使用具有一致性。
     * 场景:
     *      表示对象的部分-整体层次结构
     *      从一个整体中能够独立出部分或者功能的场景
     * 角色:
     *      Component抽象构件角色:定义添加组合对象的共有方法和属性，可以定义一些默认的行为或属性
     *      Leaf叶子构件:其下没有其它分支
     *      Composite树枝构件:树枝对象，它的作用是组合树枝节点和叶子节点形成一个属性结构
     * 案例:
     *
     * android:
     *      ViewGroup  View
     * 利弊:
     *      利:
     *         不破坏封装，整体类与局部类之间松耦合，彼此相对独立 。
     *         具有较好的可扩展性。
     *         支持动态组合。在运行时，整体对象可以选择不同类型的局部对象。
     *         整体类可以对局部类进行包装，封装局部类的接口，提供新的接口。
     *      弊:
     *         整体类不能自动获得和局部类同样的接口。
     *         创建整体类的对象时，需要创建所有局部类的对象
     */
}
