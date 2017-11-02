package gjg.com.desinmode.d07_decorator.headerrv;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class HeaderRvActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_headerrv);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        HeaderAndFooterAdapter adapter = new HeaderAndFooterAdapter(new Adapter());
        recyclerView.setAdapter(adapter);
        TextView headerView = (TextView) LayoutInflater.from(this).inflate(R.layout.support_simple_spinner_dropdown_item,recyclerView,false);
        headerView.setText("脑袋");
        adapter.addHeaderView(headerView);
        TextView footerView = (TextView) LayoutInflater.from(this).inflate(R.layout.support_simple_spinner_dropdown_item,recyclerView,false);
        footerView.setText("底部");
        adapter.addFooterView(footerView);
    }

    private static class Adapter extends RecyclerView.Adapter<ViewHolder>{


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv,parent,false);

            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
            holder.textView.setText("position-->"+position);
        }

        @Override
        public int getItemCount() {
            return 20;
        }
    }
    private static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView textView;
        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.tv);
        }
    }
}
