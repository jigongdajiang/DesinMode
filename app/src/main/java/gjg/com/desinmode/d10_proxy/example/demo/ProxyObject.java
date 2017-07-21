package gjg.com.desinmode.d10_proxy.example.demo;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class ProxyObject implements AbsObject {
    private AbsObject targetObject;

    public ProxyObject(AbsObject targetObject) {
        this.targetObject = targetObject;
    }

    @Override
    public void operation() {
        //目标操作前
        targetObject.operation();
        //目标操作后
    }
}
