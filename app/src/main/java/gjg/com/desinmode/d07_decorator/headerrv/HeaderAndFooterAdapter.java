package gjg.com.desinmode.d07_decorator.headerrv;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class HeaderAndFooterAdapter extends RecyclerView.Adapter {
    private final RecyclerView.Adapter mRealAdapter;
    private List<View> mHeaderViews;
    private List<View> mFooterViews;

    public HeaderAndFooterAdapter(RecyclerView.Adapter realAdapter){
        this.mRealAdapter = realAdapter;
        mHeaderViews = new ArrayList<>();
        mFooterViews = new ArrayList<>();
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int position) {
        //根据position来决定是不是头部
        int headCount = mHeaderViews.size();
        if(position < headCount){
            return createHeaderAndFooterViewHolder(mHeaderViews.get(position));
        }
        int realCount = mRealAdapter.getItemCount();
        if(position < headCount + realCount){
            return mRealAdapter.onCreateViewHolder(parent,mRealAdapter.getItemViewType(position));
        }
        return createHeaderAndFooterViewHolder(mFooterViews.get(position - realCount - headCount));
    }

    private RecyclerView.ViewHolder createHeaderAndFooterViewHolder(View view) {
        return new HeaderFooterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        int headCount = mHeaderViews.size();
        if(position < headCount){
            return ;
        }
        int realCount = mRealAdapter.getItemCount();
        if(position < headCount + realCount){
            mRealAdapter.onBindViewHolder(holder,position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mRealAdapter.getItemCount() + mHeaderViews.size() + mFooterViews.size();
    }

    public void addHeaderView(View view){
        if(!mHeaderViews.contains(view)){
            mHeaderViews.add(view);
            notifyDataSetChanged();
        }
    }
    public void addFooterView(View view){
        if(!mFooterViews.contains(view)){
            mFooterViews.add(view);
            notifyDataSetChanged();
        }
    }
    public void removeHeaderView(View view){
        if(mHeaderViews.contains(view)){
            mHeaderViews.remove(view);
            notifyDataSetChanged();
        }
    }
    public void removeFooterView(View view){
        if(mFooterViews.contains(view)){
            mFooterViews.remove(view);
            notifyDataSetChanged();
        }
    }
    private class HeaderFooterViewHolder extends RecyclerView.ViewHolder{
        public HeaderFooterViewHolder(View itemView) {
            super(itemView);
        }
    }
}
