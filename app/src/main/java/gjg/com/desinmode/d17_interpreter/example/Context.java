package gjg.com.desinmode.d17_interpreter.example;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 环境角色
 */


public class Context {
    private Map<Character,Integer> maps = new HashMap<>();
    public void add(Character key,Integer value){
        maps.put(key,value);
    }
    public Integer getValue(Character key){
        return maps.get(key);
    }
}
