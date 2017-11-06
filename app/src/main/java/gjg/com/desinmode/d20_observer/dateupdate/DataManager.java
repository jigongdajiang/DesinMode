package gjg.com.desinmode.d20_observer.dateupdate;

import java.util.List;

import gjg.com.desinmode.d20_observer.dateupdate.observable.Observerable;
import gjg.com.desinmode.d20_observer.dateupdate.observer.Observer;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class DataManager<M, T extends Observer<M>> {
    private static volatile DataManager mInstance;
    private Observerable<M,T> mObservable;
    private DataManager(){
        mObservable = new Observerable<>();
    }
    public static DataManager getInstance(){
        if(mInstance == null){
            synchronized (DataManager.class){
                if(mInstance == null){
                    mInstance = new DataManager();
                }
            }
        }
        return mInstance;
    }

    public void register(T observer){
        mObservable.register(observer);
    }
    public void unRegister(T observer){
        mObservable.unRegister(observer);
    }
    public void insert(M data){
        mObservable.notifyChanged(data);
    }
}
