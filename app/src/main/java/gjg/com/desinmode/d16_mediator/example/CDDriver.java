package gjg.com.desinmode.d16_mediator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 同事类-光驱
 */


public class CDDriver extends Colleague {
    public CDDriver(Mediator mediator) {
        super(mediator);
    }
    //光驱读出来的数据
    private String data;

    public String getData() {
        return data;
    }
    public void readCd(){
        this.data = "视频数据,声音数据";
        //告诉主板，读取了数据
        getMediator().changed(this);
    }
}
