package gjg.com.desinmode.d01_factorymethod.iofram;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class PreferenceIOHandler implements IIOHander {
    @Override
    public void save(String k, String v) {
        PreferenceUitls.getInstance().save(k,v);
    }

    @Override
    public String get(String k) {
        return PreferenceUitls.getInstance().get(k);
    }

    @Override
    public void remove(String k) {
        PreferenceUitls.getInstance().remove(k);
    }
}
