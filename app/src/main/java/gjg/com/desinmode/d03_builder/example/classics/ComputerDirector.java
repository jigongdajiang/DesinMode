package gjg.com.desinmode.d03_builder.example.classics;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public class ComputerDirector {
    AbsComputerBuilder mBuilder = null;

    public ComputerDirector(AbsComputerBuilder builder) {
        this.mBuilder = builder;
    }
    public void construct(int cpu,int merroy,int disk){
        mBuilder.setmCpu(cpu);
        mBuilder.setmMerrory(merroy);
        mBuilder.setmDisk(disk);
        mBuilder.create();
    }
}
