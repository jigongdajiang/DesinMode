package gjg.com.desinmode.d09_adapter.smaplelv;

import android.view.View;
import android.view.ViewGroup;

/**
 * @author : gongdaocai
 * @date : 2017/11/4
 * FileName:
 * @description:
 */


public interface ListAdaper<T> {
    int getCount();
    View getView(int postion, ViewGroup parent);
    T getItem(int position);
}
