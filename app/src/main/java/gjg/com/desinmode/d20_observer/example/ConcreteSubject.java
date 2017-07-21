package gjg.com.desinmode.d20_observer.example;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class ConcreteSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String state;
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        observers.remove(observer);
    }
    public void changeState(String s){
        this.state = s;
        this.notifyObservers();
    }
    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(state);
        }
    }

    public void setState(String state) {
        this.state = state;
    }
}
