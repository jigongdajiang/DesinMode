package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class SexCommand implements ICommand {
    private Receiver mReceiver;

    public SexCommand(Receiver receiver) {
        this.mReceiver = receiver;
    }

    @Override
    public void execute() {
        mReceiver.changeSex("男");
    }

    @Override
    public void unDo() {
        mReceiver.unDoChangeSex();
    }

    @Override
    public void reDo() {

    }
}
