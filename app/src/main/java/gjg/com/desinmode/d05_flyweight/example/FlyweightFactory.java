package gjg.com.desinmode.d05_flyweight.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class FlyweightFactory {
    private Map<Character,Flyweight> maps = new HashMap<>();
    /**
     * 单纯享元工厂方法
     */
    public Flyweight getFlyweight(Character state){
        Flyweight flyweight = maps.get(state);
        if(flyweight  == null){
            flyweight = new ConcreteFylweight('a');
            maps.put(state,flyweight);
        }
        return flyweight;
    }

    /**
     * 复合享元工厂方法
     */
    public Flyweight getFlyweight(List<Character> states){
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for(Character state : states){
            concreteCompositeFlyweight.add(state,this.getFlyweight(state));
        }
        return concreteCompositeFlyweight;
    }
}
