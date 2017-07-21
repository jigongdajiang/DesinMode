package gjg.com.desinmode.d19_state;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 状态模式
 */


public class Description {
    /**
     * 定义:
     *      不同的状态，不同的行为，或者说，每个状态都有着响应的行为
     * 场景:
     *      状态切换反复出现
     *      属性不同，行为不同
     *      任意切换更合适使用状态模式
     * 角色:
     *      环境类，又称状态管理类(Context):定义客户感兴趣的接口，维护一个具体状态类，这个实例定义的是当前状态
     *      抽象状态类(AbstractState):定义一个接口以封装与Context的一个特定状态的行为
     *      具体状态类(ConcreteState):每一个子类实现一个与Context的一个状态的行为
     * 案例:
     *      颜色改变 红黄蓝绿
     * android:
     *      StateMachine
     * 利弊:
     *      利:
     *      弊:
     */
}
