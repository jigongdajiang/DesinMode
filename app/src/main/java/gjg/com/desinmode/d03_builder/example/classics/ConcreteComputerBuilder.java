package gjg.com.desinmode.d03_builder.example.classics;

/**
 * @author : gongdaocai
 * @date : 2017/7/17
 * FileName:
 * @description:
 */


public class ConcreteComputerBuilder extends AbsComputerBuilder {
    private AbsComputerProduct product = new Computer();
    @Override
    public void setmCpu(int cpu) {
        product.setmCpu(cpu);
    }

    @Override
    public void setmMerrory(int merrory) {
        product.setmMerrory(merrory);
    }

    @Override
    public void setmDisk(int disk) {
        product.setmDisk(disk);
    }

    @Override
    public AbsComputerProduct create() {
        return product;
    }
}
