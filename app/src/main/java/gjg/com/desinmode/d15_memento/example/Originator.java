package gjg.com.desinmode.d15_memento.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 源发器
 */


public class Originator {
    private String state;
    private String other;

    public Originator(String state, String other) {
        this.state = state;
        this.other = other;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public Memento crateMemento(){
        return new Memento(this);
    }
    public void restoreState(Memento memento){
        this.state = memento.getState();
    }
}
