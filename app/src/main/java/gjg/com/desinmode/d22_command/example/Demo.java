package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class Demo {
    public void main(){
        Invoker invoker = new Invoker();
        Receiver receiver = new Receiver(new PersonBean("Gjg","男"));
        invoker.setNameCommand(new NameCommand(receiver));
        invoker.setNameCommand(new SexCommand(receiver));
        invoker.invoke(0);
        invoker.invoke(1);
    }
}
