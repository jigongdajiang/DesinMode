package gjg.com.desinmode.d16_mediator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 抽象同事类
 */


public abstract class Colleague {
    //持有一个调停者对象
    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
