package gjg.com.desinmode.d03_builder.example.classics;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public abstract class AbsComputerBuilder {
    public abstract void setmCpu(int cpu) ;

    public abstract void setmMerrory(int merrory);

    public abstract void setmDisk(int disk) ;

    public abstract AbsComputerProduct create();
}
