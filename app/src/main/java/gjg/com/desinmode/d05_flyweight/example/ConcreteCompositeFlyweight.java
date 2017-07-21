package gjg.com.desinmode.d05_flyweight.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class ConcreteCompositeFlyweight implements Flyweight{
    private Map<Character,Flyweight> files = new HashMap<>();

    /**
     * 增加一个新的单纯享元对象到集合中
     */
    public void add(Character key,Flyweight flyweight){
        files.put(key,flyweight);
    }


    /**
     * 外蕴状态作为参数传入
     */
    @Override
    public void operation(String p) {
        Flyweight flyweight = null;
        for(Object o : files.keySet()){
            flyweight = files.get(o);
            flyweight.operation(p);
        }
    }
}
