package gjg.com.desinmode.d20_observer.example;


/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 抽象主题
 */


public interface Subject {
    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyObservers();
}
