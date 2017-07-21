package gjg.com.desinmode.d20_observer.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class ConcreteObserver implements Observer {
    private String state;
    private Subject subject;

    public ConcreteObserver(Subject subject) {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    @Override
    public void update(Object o) {
        this.state = (String) o;
    }
}
