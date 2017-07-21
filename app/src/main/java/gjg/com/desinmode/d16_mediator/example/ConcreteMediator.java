package gjg.com.desinmode.d16_mediator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 具体调停者
 */


public class ConcreteMediator implements Mediator {
    //需要知道要交互的同事类-光驱类
    private CDDriver cdDriver = null;
    //CPU
    private CPU cpu = null;
    //声卡
    private SoundCard soundCard = null;
    //显卡
    private VideoCard videoCard = null;

    public void setCdDriver(CDDriver cdDriver) {
        this.cdDriver = cdDriver;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }

    @Override
    public void changed(Colleague c) {
        if(c instanceof CDDriver){
            opeCDDriverReadData((CDDriver) c);
        }else if(c instanceof CPU){
            openCPU((CPU) c);
        }
    }

    /**
     * 处理光驱的数据交给cpu
     */
    private void opeCDDriverReadData(CDDriver cd){
        String data = cd.getData();
        //交给cpu处理
        cpu.executeData(data);
    }
    /**
     * CPU处理的数据交给显卡和声卡去播放
     */
    private void openCPU(CPU c){
        String videoData = c.getVideoData();
        String soundData = c.getSoundData();
        soundCard.soundData(soundData);
        videoCard.showData(videoData);
    }
}
