package gjg.com.desinmode.d23_abstractfactory.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class ConcrrteFactoryOne extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ProductAOne();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductBOne();
    }
}
