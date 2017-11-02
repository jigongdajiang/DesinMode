package gjg.com.desinmode;

import android.app.Application;

import gjg.com.desinmode.d01_factorymethod.iofram.PreferenceUitls;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUitls.getInstance().init(this);
    }
}
