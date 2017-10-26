package gjg.com.desinmode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import gjg.com.desinmode.d02_singleton.atvmanager.InfoActvity;

/**
 * 单纯的为了示例代码的存储
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickSingle(View view) {
        startActivity(new Intent(this, InfoActvity.class));
    }

    public void clickBuilder(View view) {

    }
}
