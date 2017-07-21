package gjg.com.desinmode.d20_observer.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class Demo {
    public void main(){
        ConcreteSubject subject = new ConcreteSubject();
        subject.setState("state1");
        Observer observer1 = new ConcreteObserver(subject);
        Observer observer2 = new ConcreteObserver(subject);
        Observer observer3 = new ConcreteObserver(subject);
        subject.changeState("status");

    }
}
