package gjg.com.desinmode.d11_facade.smaple2.handler;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description: 责任者设置接口
 */


public interface IHandler<T extends AbsHandler> {
    void nextHandler(T handler);
}
