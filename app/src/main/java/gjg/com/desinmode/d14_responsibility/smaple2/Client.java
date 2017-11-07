package gjg.com.desinmode.d14_responsibility.smaple2;

import gjg.com.desinmode.d14_responsibility.smaple2.iterator.Iterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class Client {
    public static void main(String[] args){
        // 根据用户名和密码 去两个系统中查询用户信息
        WxUserSystem wxUserSystem = new WxUserSystem();
        QQUserSystem qqUserSystem = new QQUserSystem();
        NyUserSystem nyUserSystem = new NyUserSystem();
        wxUserSystem.nextHandler(qqUserSystem);
        qqUserSystem.nextHandler(nyUserSystem);

        UserInfo loginUserInfo = wxUserSystem.query("诸葛亮","123456");
        if(loginUserInfo != null){
            System.out.println("登录成功-->"+loginUserInfo.getUserName());
        }else{
            System.out.println("登录失败,用户名密码错误");
        }
    }
}
