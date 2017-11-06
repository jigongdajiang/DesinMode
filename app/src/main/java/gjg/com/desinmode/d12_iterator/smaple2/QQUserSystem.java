package gjg.com.desinmode.d12_iterator.smaple2;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.d12_iterator.smaple2.iterator.Aggregate;
import gjg.com.desinmode.d12_iterator.smaple2.iterator.Iterator;
import gjg.com.desinmode.d12_iterator.smaple2.iterator.QQInterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 * List 存储
 */


public class QQUserSystem implements Aggregate<UserInfo>{
    private List<UserInfo> userInfos;
    public QQUserSystem(){
        userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("GG","123456","11","男"));
        userInfos.add(new UserInfo("HH","123457","12","女"));
        userInfos.add(new UserInfo("MM","123458","13","男"));
        userInfos.add(new UserInfo("CC","123459","14","男"));
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    @Override
    public Iterator<UserInfo> interator() {
        return new QQInterator(userInfos);
    }
}
