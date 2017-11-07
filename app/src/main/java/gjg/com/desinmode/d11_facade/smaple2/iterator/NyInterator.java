package gjg.com.desinmode.d11_facade.smaple2.iterator;

import java.util.List;

import gjg.com.desinmode.d11_facade.smaple2.UserInfo;


/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class NyInterator implements Iterator<UserInfo> {
    private List<UserInfo> userInfos;
    private int index;

    public NyInterator(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public UserInfo next() {
        return userInfos.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index < userInfos.size();
    }
}
