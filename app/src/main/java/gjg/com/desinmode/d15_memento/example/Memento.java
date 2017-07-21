package gjg.com.desinmode.d15_memento.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 备忘录
 */


public class Memento {
    private String state;//源发器要保存的状态

    public Memento(Originator originator) {
        this.state = originator.getState();
    }

    public String getState() {
        return state;
    }

    public void setState(Originator originator) {
        this.state = originator.getState();
    }
}
