package gjg.com.desinmode.d15_memento.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 备忘录保存者
 */


public class Caretaker {
    private Memento memento;

    public Caretaker(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
