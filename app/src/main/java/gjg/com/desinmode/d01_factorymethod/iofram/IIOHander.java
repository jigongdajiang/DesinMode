package gjg.com.desinmode.d01_factorymethod.iofram;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public interface IIOHander {
    void save(String k,String v);
    String get(String k);
    void remove(String k);
}
