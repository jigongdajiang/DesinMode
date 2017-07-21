package gjg.com.desinmode.d10_proxy;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *      代理模式
 */


public class Description {
    /**
     * 定义:
     *      代理模式是对象的结构模式，代理模式给某个对象提供一个代理对象，并由代理对象控制对原对象的引用
     * 场景:
     *      一个人或机构代表另一个人或机构采取行动
     *      一个客户端不想活着不能直接引用一个对象，代理对象可以在客户和目标对象之间起到中介作用
     * 角色:
     *      AbsObject:代理对象和目标对象的共同抽象
     *      TargetObject:目标对象
     *      ProxyObject:代理对象，代理对象的含有目标对象的引用
     * Android:
     *      Binder:
     *         集成IBinder接口
     *         从IPC角度来说，是跨进程通信的方式
     *         也可以理解为一个物理设备 dev/binder
     *         从Android Framework来说，Binder是ServiceManager连接各种Manager和相应Service的桥梁
     *         从Android应用层来说，是客户端和服务端通讯的媒介
     *
     *         作用:将客户端参数通过parcel包装后给服务端，服务端解析后将结果写入另一个parcel返回给客户端，Binder将结果解析后将原始结果再返回给服务端
     */
}
