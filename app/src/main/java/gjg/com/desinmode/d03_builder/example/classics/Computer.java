package gjg.com.desinmode.d03_builder.example.classics;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public class Computer extends AbsComputerProduct {
    @Override
    public void setmCpu(int cpu) {
        this.mCpu = cpu;
    }

    @Override
    public void setmMerrory(int merrory) {
        this.mMerrory = merrory;
    }

    @Override
    public void setmDisk(int disk) {
        this.mDisk = disk;
    }
}
