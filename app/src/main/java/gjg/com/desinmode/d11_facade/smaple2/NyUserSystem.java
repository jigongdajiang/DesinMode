package gjg.com.desinmode.d11_facade.smaple2;

import java.util.ArrayList;
import java.util.List;

import gjg.com.desinmode.d11_facade.smaple2.handler.AbsHandler;
import gjg.com.desinmode.d11_facade.smaple2.iterator.Iterator;
import gjg.com.desinmode.d11_facade.smaple2.iterator.NyInterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 * List 存储
 */


public class NyUserSystem extends AbsHandler {
    private List<UserInfo> userInfos;
    public NyUserSystem(){
        userInfos = new ArrayList<>();
        userInfos.add(new UserInfo("诸葛亮","123456","11","男"));
        userInfos.add(new UserInfo("貂蝉","123457","12","女"));
        userInfos.add(new UserInfo("孙斌","123458","13","男"));
        userInfos.add(new UserInfo("狄仁杰","123459","14","男"));
    }

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    @Override
    public Iterator<UserInfo> interator() {
        return new NyInterator(userInfos);
    }
}
