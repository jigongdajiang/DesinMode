package gjg.com.desinmode.d18_stratrgy;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *      策略模式
 */


public class Description {
    /**
     * 定义:
     *      策略模式定义了一系列算法，并将每个算法封装起来，而且使他们可以互相转换。
     *      策略模式让算法独立于使用它的客户
     * 场景:
     *      针对同一类问题有多种处理方式，仅仅是具体行为上有差别时
     *      需要安全的封装多种同一类型的操作时
     *      出现同一抽象多个子类，而仅仅是需要使用if-else或者switch-case来选择时
     * 角色:
     *      Context:用来操作策略的上下文环境
     *      AbsStrategy:策略的抽象
     *      Strategy:具体策略
     * 案例:
     *      加减操作
     * android应用:
     *      animation中的Interpolator
     * 利弊:
     *      利:解耦，清晰
     *      弊:要创建好多类
     */
}
