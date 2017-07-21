package gjg.com.desinmode.d23_abstractfactory.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class ConcrrteFactoryTwo extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductATwo();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBTwo();
    }
}
