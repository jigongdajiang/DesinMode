package gjg.com.desinmode.d23_abstractfactory.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 抽象工厂  A和B组成一族
 */


public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
}
