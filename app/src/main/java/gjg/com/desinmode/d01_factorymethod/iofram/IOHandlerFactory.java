package gjg.com.desinmode.d01_factorymethod.iofram;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class IOHandlerFactory implements IIOHandlerFactory {
    private static volatile IOHandlerFactory mInstance;
    private IOHandlerFactory(){}
    public static IOHandlerFactory getInstance(){
        if(mInstance == null){
            synchronized (IOHandlerFactory.class){
                if(mInstance == null){
                    mInstance = new IOHandlerFactory();
                }
            }
        }
        return mInstance;
    }
    @Override
    public IIOHander createIOHandler(Class<? extends IIOHander> c) {
        try {
            return c.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new PreferenceIOHandler();
    }

    public  IIOHander createMemoryIOHandler(){
        return createIOHandler(MemoryIOHandler.class);
    }
    public  IIOHander createPreferenceIOHandler(){
        return createIOHandler(PreferenceIOHandler.class);
    }

    public  IIOHander createDefaultIOHandler(){
        return createPreferenceIOHandler();
    }
}
