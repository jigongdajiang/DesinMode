package gjg.com.desinmode.d13_template.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public abstract class AbsStartComputer {
    private void start(){
        powerOn();
        checkHardWare();
        loadOs();
        login();
    }

    protected abstract void powerOn();

    protected abstract void checkHardWare();

    protected abstract void loadOs();

    protected abstract void login();
}
