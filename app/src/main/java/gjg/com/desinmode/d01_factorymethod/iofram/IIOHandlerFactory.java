package gjg.com.desinmode.d01_factorymethod.iofram;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public interface IIOHandlerFactory {
    IIOHander createIOHandler(Class<? extends IIOHander> c);
}
