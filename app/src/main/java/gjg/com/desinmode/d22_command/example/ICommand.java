package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public interface ICommand {
    void execute();
    void unDo();
    void reDo();
}
