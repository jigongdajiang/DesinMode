package gjg.com.desinmode.d01_factorymethod.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 具体工厂
 */


public class FruitsFactory implements IFruitsFactory {
    @Override
    public <T extends AbsFruits> T getFruits(Class<T> clz) {
        try {
            return (T) Class.forName(clz.getName()).newInstance();
        }catch (Exception e){
                return null;
        }
    }
}
