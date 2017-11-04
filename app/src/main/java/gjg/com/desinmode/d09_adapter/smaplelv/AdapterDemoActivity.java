package gjg.com.desinmode.d09_adapter.smaplelv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/11/4
 * FileName:
 * @description:
 */


public class AdapterDemoActivity extends AppCompatActivity {
    private MyListView myListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adapter_demo);
        myListView = (MyListView) findViewById(R.id.mylistview);
        List<String> datas = new ArrayList<>();
        for(int i = 0;i<20;i++){
            datas.add("牛逼吧"+i);
        }
        MyAdapper adapper = new MyAdapper(datas);
        myListView.setAdapter(adapper);
    }
    private class MyAdapper implements ListAdaper<String>{
        private List<String> mDatas;

        public MyAdapper(List<String> datas) {
            this.mDatas = datas;
        }

        @Override
        public int getCount() {
            return mDatas.size();
        }

        @Override
        public View getView(int postion, ViewGroup parent) {
            View view = LayoutInflater.from(AdapterDemoActivity.this).inflate(R.layout.item_adapter_demo,parent,false);
            TextView textView = (TextView) view.findViewById(R.id.tv_item);
            textView.setText(mDatas.get(postion));
            return view;
        }

        @Override
        public String getItem(int position) {
            return mDatas.get(position);
        }
    }
}
