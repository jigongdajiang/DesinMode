package gjg.com.desinmode.d20_observer.dateupdate.observable;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.d20_observer.dateupdate.observer.Observer;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class Observerable<M, T extends Observer<M>> {
    private List<T> mObservers;
    public Observerable(){
        mObservers = new ArrayList<>();
    }
    public void register(T observer){
        if(!mObservers.contains(observer)){
            mObservers.add(observer);
        }
    }
    public void unRegister(T observer){
        if(mObservers.contains(observer)){
            mObservers.remove(observer);
        }
    }
    public void notifyChanged(M data){
        for (T oserver : mObservers) {
            oserver.update(data);
        }
    }
}
