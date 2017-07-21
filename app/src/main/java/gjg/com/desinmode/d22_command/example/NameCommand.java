package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class NameCommand implements ICommand {
    private Receiver mReceiver;

    public NameCommand(Receiver receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.changeName("aaa");
    }

    @Override
    public void unDo() {
        mReceiver.unDoChangeName();
    }

    @Override
    public void reDo() {

    }
}
