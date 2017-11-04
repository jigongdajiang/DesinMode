package gjg.com.desinmode.d09_adapter.smaplelv;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

/**
 * @author : gongdaocai
 * @date : 2017/11/4
 * FileName:
 * @description:
 */


public class MyListView extends ScrollView {
    private LinearLayout mContainer;
    private ListAdaper mAdapter;
    public MyListView(Context context) {
        this(context,null);
    }

    public MyListView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContainer = new LinearLayout(context);
        mContainer.setOrientation(LinearLayout.VERTICAL);
        addView(mContainer,0);
    }
    public void setAdapter(ListAdaper adapter){
        this.mAdapter = adapter;
        int count = adapter.getCount();
        for(int i = 0; i< count; i++){
            mContainer.addView(mAdapter.getView(i,mContainer));
        }
    }
}
