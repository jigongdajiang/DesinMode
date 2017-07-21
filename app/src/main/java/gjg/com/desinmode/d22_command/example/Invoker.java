package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class Invoker {
    private ICommand nameCommand;
    private ICommand sexCommand;

    public void setNameCommand(ICommand nameCommand) {
        this.nameCommand = nameCommand;
    }

    public void setSexCommand(ICommand sexCommand) {
        this.sexCommand = sexCommand;
    }

    public void invoke(int type){
        if(type == 0){
            nameCommand.execute();
            sexCommand.execute();
        }else{
            nameCommand.unDo();
            sexCommand.unDo();
        }
    }
}
