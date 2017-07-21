package gjg.com.desinmode.d16_mediator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 抽象调停者
 */


public interface Mediator {
    /**
     * 同事对象在自身变化时通知调停者的方法，让调停者负责去与其它的同事类交互
     */
    void changed(Colleague c);
}
