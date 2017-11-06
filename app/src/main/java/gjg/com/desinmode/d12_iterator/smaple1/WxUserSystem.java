package gjg.com.desinmode.d12_iterator.smaple1;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 *  数组存储
 */


public class WxUserSystem {
    private UserInfo[] userInfos;
    public WxUserSystem(){
        userInfos = new UserInfo[4];
        userInfos[0] = new UserInfo("高高","123456","11","男");
        userInfos[1] = new UserInfo("好好","123457","12","女");
        userInfos[2] = new UserInfo("美美","123458","13","男");
        userInfos[3] = new UserInfo("彩彩","123459","14","男");
    }

    public UserInfo[] getUserInfos() {
        return userInfos;
    }
}
