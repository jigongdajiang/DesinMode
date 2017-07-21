package gjg.com.desinmode.d11_facade;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *  外观模式
 */


public class Description {
    /**
     * 定义:
     *      子系统外部与与内部的通讯必须通过一个对象进行。
     * 使用场景:
     *      1.设计初期阶段，将两个层进行分离
     *      2.开发阶段，子系统复杂度越来越大，导致其外部调用变难，增加一个facade，降低依赖性
     *      3.维护已经不易扩展的含有重要功能的老系统时
     * 角色:
     *      Client(外部客户端)----Facade(外观对象)----Systems(子系统)
     * Example:
     *      人---遥控器---电视
     * Android中的应用:
     *      Context是一个典型的Facade对象，比如其能startActivity，startService，bindService等
     * 利弊:
     *      利:客户端与子系统解耦
     *      弊:违背开闭原则，子系统变化，外观对象也要变
     */
}
