package gjg.com.desinmode.d14_responsibility.smaple2;

import gjg.com.desinmode.d14_responsibility.smaple2.handler.AbsHandler;
import gjg.com.desinmode.d14_responsibility.smaple2.iterator.Aggregate;
import gjg.com.desinmode.d14_responsibility.smaple2.iterator.Iterator;
import gjg.com.desinmode.d14_responsibility.smaple2.iterator.WxInterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 *  数组存储
 */


public class WxUserSystem extends AbsHandler {
    private UserInfo[] userInfos;
    public WxUserSystem(){
        userInfos = new UserInfo[4];
        userInfos[0] = new UserInfo("高高","123456","11","男");
        userInfos[1] = new UserInfo("好好","123457","12","女");
        userInfos[2] = new UserInfo("美美","123458","13","男");
        userInfos[3] = new UserInfo("彩彩","123459","14","男");
    }


    @Override
    public Iterator<UserInfo> interator() {
        return new WxInterator(userInfos);
    }
}
