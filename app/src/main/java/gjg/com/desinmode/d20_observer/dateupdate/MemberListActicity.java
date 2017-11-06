package gjg.com.desinmode.d20_observer.dateupdate;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.R;
import gjg.com.desinmode.d20_observer.dateupdate.observer.Observer;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description:
 */


public class MemberListActicity extends AppCompatActivity implements Observer<Member> {
    private ListView mMemberLv;
    private BaseAdapter mAdapter;
    private List<Member> mDatas;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_member_list);
        mMemberLv = (ListView) findViewById(R.id.lv_member);
        if(mDatas == null){
            mDatas = new ArrayList<>();
        }
        setAdapter();
        DataManager.getInstance().register(this);
    }

    private void setAdapter() {
        if(mAdapter == null){
            mAdapter = new BaseAdapter() {
                @Override
                public int getCount() {
                    return mDatas.size();
                }

                @Override
                public Object getItem(int position) {
                    return mDatas.size() > 0 ? mDatas.get(position) : null;
                }

                @Override
                public long getItemId(int position) {
                    return position;
                }

                @Override
                public View getView(int position, View convertView, ViewGroup parent) {
                    View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_member,parent,false);
                    TextView tvName = (TextView) view.findViewById(R.id.tv_name);
                    TextView tvAge = (TextView) view.findViewById(R.id.tv_age);
                    tvName.setText(mDatas.get(position).getName());
                    tvAge.setText(mDatas.get(position).getAge());
                    return view;
                }
            };
        }else{
            mAdapter.notifyDataSetChanged();
        }
        mMemberLv.setAdapter(mAdapter);
    }


    public void addMember(View view) {
        startActivity(new Intent(this,AddMemberActivity.class));
    }

    @Override
    public void update(Member data) {
        mDatas.add(data);
        mAdapter.notifyDataSetChanged();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        DataManager.getInstance().unRegister(this);
    }
}
