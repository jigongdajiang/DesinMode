package gjg.com.desinmode.d20_observer;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 观察者模式
 */


public class Description {
    /**
     * 定义:
     *      观察者模式定义了一种一对多的依赖关系，使得每当一个对象改变状态，则所有的依赖它的对象都会得到通知并自动更新
     * 场景:
     *      一个状态的更新，需要其它对象同步更新，而其它对象的数量动态可变
     *      对象仅需要将自己的更新通知给其它对象，而不需要知道其它对象的细节
     * 角色:
     *      抽象观察者(AbstractObserver):所有潜在的观察者都应事先这个接口，这个接口应该只有update方法，当主题改变时，它被调用
     *      具体观察者(ConcreteObserver):
     * 案例:
     *      见example
     * android:
     *      Rxjava
     * 利弊:
     *      利:高内聚，低耦合
     *      弊:观察多的时候可能性能不是很好
     */
}
