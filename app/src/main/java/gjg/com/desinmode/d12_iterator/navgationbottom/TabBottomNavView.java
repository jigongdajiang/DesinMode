package gjg.com.desinmode.d12_iterator.navgationbottom;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.d12_iterator.navgationbottom.interator.TabInterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class TabBottomNavView extends LinearLayout {
    private List<AbsTabBottomItem> mTabItems;
    private int mCurrentIndex = -1;
    public TabBottomNavView(Context context) {
        this(context,null);
    }

    public TabBottomNavView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public TabBottomNavView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setOrientation(HORIZONTAL);
        mTabItems = new ArrayList<>();
    }
    public void addTabItems(TabInterator interator){
       List<AbsTabBottomItem> items = new ArrayList<>();
        while (interator.hasNext()) {
            items.add(interator.next());
        }
        addTabItems(items);
    }
    public void addTabItems(List<AbsTabBottomItem> tabBottomItems){
        mTabItems.clear();
        mTabItems.addAll(tabBottomItems);
        for(int i=0;i<mTabItems.size();i++){
            AbsTabBottomItem item = mTabItems.get(i);
            View tabView = item.getTabView();
            addView(tabView);
            LayoutParams params = (LayoutParams) tabView.getLayoutParams();
            params.weight = 1;
            params.gravity = Gravity.CENTER;
            tabView.setLayoutParams(params);
            //设置点击事件
            final int finalI = i;
            tabView.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {
                    setCurrentItem(finalI);
                }
            });
        }
        mCurrentIndex = 0;
        //选中当前
        mTabItems.get(mCurrentIndex).setSelect(true);
    }

    public void setCurrentItem(int position) {
        if(mCurrentIndex != position){
            //取消当前的选中
            mTabItems.get(mCurrentIndex).setSelect(false);
            mCurrentIndex = position;
            //选中当前
            mTabItems.get(mCurrentIndex).setSelect(true);
        }
    }

    public int getCurrentPosition() {
        return mCurrentIndex;
    }
    public AbsTabBottomItem getCurrentItem(){
        return getItem(mCurrentIndex);
    }
    public AbsTabBottomItem getItem(int postion){
        return mTabItems.get(postion);
    }
}
