package gjg.com.desinmode.d02_singleton.atvmanager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * @author : gongdaocai
 * @date : 2017/10/26
 * FileName:
 * @description:
 */


public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AtyManager.getInstance().attach(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        AtyManager.getInstance().detach(this);
    }
}
