package gjg.com.desinmode.d11_facade.smaple2.facade;

import gjg.com.desinmode.d11_facade.smaple2.IUserFunction;
import gjg.com.desinmode.d11_facade.smaple2.NyUserSystem;
import gjg.com.desinmode.d11_facade.smaple2.QQUserSystem;
import gjg.com.desinmode.d11_facade.smaple2.UserInfo;
import gjg.com.desinmode.d11_facade.smaple2.WxUserSystem;
import gjg.com.desinmode.d11_facade.smaple2.handler.AbsHandler;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 * 用户信息查询外观类 子系统的操作封装到这个外观里，使得client能更容易使用
 */


public class UserInfoFacade implements IUserFunction{
    private AbsHandler firstHandler;

    public UserInfoFacade() {
        this.firstHandler = new WxUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();
        NyUserSystem nyUserSystem = new NyUserSystem();
        firstHandler.nextHandler(qqUserSystem);
        qqUserSystem.nextHandler(nyUserSystem);
    }

    @Override
    public UserInfo query(String name, String pwd) {
        return firstHandler.query(name,pwd);
    }
}
