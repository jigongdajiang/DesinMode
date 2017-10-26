package gjg.com.desinmode.d02_singleton.atvmanager;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/10/26
 * FileName:
 * @description:
 */


public class LoginActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        setTitle("登录页");
    }
    public void click(View view) {
        startActivity(new Intent(this,RegActivity.class));
    }
}
