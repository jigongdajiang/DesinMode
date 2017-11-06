package gjg.com.desinmode.d12_iterator.navgationbottom;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import gjg.com.desinmode.R;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class TabBottomItem extends AbsTabBottomItem<TabBean> {
    public TabBottomItem(Context mContext, int mLayoutId, TabBean mInitBean) {
        super(mContext, mLayoutId, mInitBean);
    }
    public TabBottomItem(Context mContext, TabBean mInitBean) {
        this(mContext, R.layout.tab_item_layout, mInitBean);
    }

    @Override
    protected void initLayout(TabBean mInitBean) {
        ImageView imageView = findViewById(R.id.iv_tab);
        TextView textView = findViewById(R.id.tv_tab);
        imageView.setImageResource(mInitBean.getmImgIconDrawableSelectorId());
        textView.setText(mInitBean.getText());
        textView.setTextColor(mContext.getResources().getColorStateList(mInitBean.getmTextColorSelectorId()));

    }

    @Override
    public void setSelect(boolean isSelected) {
        ImageView imageView = findViewById(R.id.iv_tab);
        TextView textView = findViewById(R.id.tv_tab);
        imageView.setSelected(isSelected);
        textView.setSelected(isSelected);
    }
}
