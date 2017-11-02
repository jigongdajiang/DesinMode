package gjg.com.desinmode.d01_factorymethod.iofram;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class FactoryActivity extends AppCompatActivity {
    private TextView tv_des;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factory);
        tv_des = (TextView) findViewById(R.id.tv_des);
    }

    public void get(View view) {
        String name = IOHandlerFactory.getInstance().createDefaultIOHandler().get("name");
        tv_des.setText(name);
    }

    public void save(View view) {
        IOHandlerFactory.getInstance().createDefaultIOHandler().save("name","二妮");
    }
}
