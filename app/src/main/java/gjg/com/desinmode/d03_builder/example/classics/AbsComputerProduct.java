package gjg.com.desinmode.d03_builder.example.classics;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public abstract class AbsComputerProduct {
    protected int mCpu;
    protected int mMerrory;
    protected int mDisk;

    public abstract void setmCpu(int cpu) ;

    public abstract void setmMerrory(int merrory);

    public abstract void setmDisk(int disk) ;
}
