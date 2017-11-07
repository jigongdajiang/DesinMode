package gjg.com.desinmode.d11_facade.smaple2.iterator;


import gjg.com.desinmode.d11_facade.smaple2.UserInfo;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class WxInterator implements Iterator<UserInfo> {
    private UserInfo[] userInfos;
    private int index;
    public WxInterator(UserInfo[] userInfos) {
        this.userInfos = userInfos;
    }

    @Override
    public UserInfo next() {
        return userInfos[index++];
    }

    @Override
    public boolean hasNext() {
        return index < userInfos.length;
    }
}
