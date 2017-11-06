package gjg.com.desinmode.d20_observer.dateupdate;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class AddMemberActivity extends AppCompatActivity {
    private EditText mEdtName,mEdtAge;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_member);
        mEdtName = (EditText) findViewById(R.id.edt_name);
        mEdtAge = (EditText) findViewById(R.id.edt_age);
    }

    public void addMember(View view) {
        String name = mEdtName.getText().toString().trim();
        String age = mEdtAge.getText().toString().trim();
        if(!TextUtils.isEmpty(name) && !TextUtils.isEmpty(age)){
            addMember2Datas(name,age);
        }
    }

    private void addMember2Datas(String name, String age) {
        Member member = new Member(name,age);
        DataManager.getInstance().insert(member);
    }

    public void over(View view) {
        finish();
    }
}
