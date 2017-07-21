package gjg.com.desinmode.d15_memento.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class Demo {
    public void main(){
        //创建源发器
        Originator originator = new Originator("state1","other");
        //创建备忘录
        Memento memento = originator.crateMemento();
        //备忘录存储
        Caretaker caretaker = new Caretaker(memento);


        // 修改原始类的状态
        System.out.println("初始化状态为：" + originator.getState());
        originator.setState("状态2");
        System.out.println("修改后的状态为：" + originator.getState());

        // 回复原始类的状态
        originator.restoreState(caretaker.getMemento());
        System.out.println("恢复后的状态为：" + originator.getState());
    }
}
