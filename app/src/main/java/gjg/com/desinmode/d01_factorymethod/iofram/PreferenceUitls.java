package gjg.com.desinmode.d01_factorymethod.iofram;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class PreferenceUitls implements IIOHander {
    private static volatile PreferenceUitls mInstance;
    private SharedPreferences preferences;

    private PreferenceUitls(){
    }

    public static PreferenceUitls getInstance(){
        if(mInstance == null){
            synchronized (PreferenceUitls.class){
                if(mInstance == null){
                    mInstance = new PreferenceUitls();
                }
            }
        }
        return mInstance;
    }
    public void init(Context context){
        preferences = context.getApplicationContext().getSharedPreferences("app_sharepreference",Context.MODE_PRIVATE);
    }


    @Override
    public void save(String k, String v) {
        vertryInit();
        preferences.edit().putString(k,v).apply();
    }

    @Override
    public String get(String k) {
        vertryInit();
        return preferences.getString(k,"");
    }

    @Override
    public void remove(String k) {
        vertryInit();
        preferences.edit().remove(k).apply();
    }

    private void vertryInit() {
        if(preferences == null){
            throw new IllegalStateException("init() should apply");
        }
    }
}
