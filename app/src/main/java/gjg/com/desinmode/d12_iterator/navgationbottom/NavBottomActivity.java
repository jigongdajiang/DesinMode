package gjg.com.desinmode.d12_iterator.navgationbottom;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import gjg.com.desinmode.R;
import gjg.com.desinmode.d12_iterator.navgationbottom.interator.ListTabInterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description: 底部导航栏实现底部导航栏
 */


public class NavBottomActivity extends AppCompatActivity {
    private TabBottomNavView tab;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav_bottom);
        tab = (TabBottomNavView) findViewById(R.id.tab);
        ListTabInterator<TabBottomItem> itemListIterator = new ListTabInterator<>();
        itemListIterator.addTabItem(new TabBottomItem(this,new TabBean("首页",R.drawable.icon_bg_selector,R.drawable.color_tab_text)));
        itemListIterator.addTabItem(new TabBottomItem(this,new TabBean("投资",R.drawable.icon_bg_selector,R.drawable.color_tab_text)));
        itemListIterator.addTabItem(new TabBottomItem(this,new TabBean("发现",R.drawable.icon_bg_selector,R.drawable.color_tab_text)));
        itemListIterator.addTabItem(new TabBottomItem(this,new TabBean("我的",R.drawable.icon_bg_selector,R.drawable.color_tab_text)));
        tab.addTabItems(itemListIterator);
    }
}
