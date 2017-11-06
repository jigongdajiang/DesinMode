package gjg.com.desinmode.d12_iterator.navgationbottom;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 *
 * 抽象Tab
 * 一种布局对应一组展示信息
 *
 * 有选中状态和非选中状态，交由子类实现
 *
 */


public abstract class AbsTabBottomItem<D> {
    protected Context mContext;
    protected int mLayoutId;
    protected View mTabView;
    protected D mInitBean;//布局对应的数据对象
    protected SparseArray<View> mViews;

    public AbsTabBottomItem(Context mContext, int mLayoutId, D mInitBean) {
        this.mContext = mContext;
        this.mLayoutId = mLayoutId;
        this.mInitBean = mInitBean;
        mViews = new SparseArray<>();
    }

    public View getTabView(){
        if(mTabView == null){
            mTabView = LayoutInflater.from(mContext).inflate(mLayoutId,null,false);
            initLayout(mInitBean);
        }
        return mTabView;
    }

    protected abstract void initLayout(D mInitBean);


    public <T extends View> T findViewById(int id){
        T view = (T) mViews.get(id);
        if(view == null){
            view = (T) mTabView.findViewById(id);
            mViews.put(id,view);
        }
        return view;
    }
    /**
     * 当前条目是否选中
     * @param isSelected
     */
    public abstract void setSelect(boolean isSelected);
}
