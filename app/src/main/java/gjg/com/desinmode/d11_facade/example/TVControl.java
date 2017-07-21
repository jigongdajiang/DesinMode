package gjg.com.desinmode.d11_facade.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class TVControl {
    //所有子系统
    private PowerSys powerSys = new PowerSys();
    private VoliceSys voliceSys = new VoliceSys();
    private ChangeSys changeSys = new ChangeSys();

    public void on(){
        powerSys.on();
    }
    public void off(){
        powerSys.off();
    }
    public void up(){
        voliceSys.up();
    }
    public void down(){
        voliceSys.down();
    }
    public void change(){
        changeSys.change();
    }
}
