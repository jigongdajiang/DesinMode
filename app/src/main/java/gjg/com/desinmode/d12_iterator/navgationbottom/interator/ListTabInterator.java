package gjg.com.desinmode.d12_iterator.navgationbottom.interator;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.d12_iterator.navgationbottom.AbsTabBottomItem;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class ListTabInterator<T extends AbsTabBottomItem> implements TabInterator {
    List<T> tabItems;

    public ListTabInterator() {
        this.tabItems = new ArrayList<>();
    }

    private int index = 0;
    @Override
    public AbsTabBottomItem next() {
        return tabItems.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < tabItems.size();
    }
    public void addTabItem(T item){
        tabItems.add(item);
    }
}
