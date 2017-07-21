package gjg.com.desinmode.d16_mediator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class CPU extends Colleague {
    public CPU(Mediator mediator) {
        super(mediator);
    }
    private String videoData;//分解出的视频数据
    private String soundData;//分解出的声音数据

    public String getVideoData() {
        return videoData;
    }

    public String getSoundData() {
        return soundData;
    }

    /**
     * 处理数据，分解出视频和音频数据
     */
    public void executeData(String data){
        String[] array = data.split(",");
        this.videoData = array[0];
        this.soundData = array[1];
        //通知主板，数据分解完成
        getMediator().changed(this);
    }
}
