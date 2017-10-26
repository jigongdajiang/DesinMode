package gjg.com.desinmode.d01_factorymethod.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 抽象接口
 */


public interface IFruitsFactory {
    <T extends AbsFruits> T getFruits(Class<T> clz);
}
