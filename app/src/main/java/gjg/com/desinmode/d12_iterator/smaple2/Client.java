package gjg.com.desinmode.d12_iterator.smaple2;

import java.util.List;

import gjg.com.desinmode.d12_iterator.smaple2.iterator.Iterator;

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
        UserInfo loginUserInfo = query("GG","123456",wxUserSystem.interator());
        if(null == loginUserInfo){
            QQUserSystem qqUserSystem = new QQUserSystem();
            loginUserInfo = query("GG","123456",qqUserSystem.interator());
        }
        if(loginUserInfo != null){
            System.out.println("登录成功-->"+loginUserInfo.getUserName());
        }else{
            System.out.println("登录失败,用户名密码错误");
        }
    }

    private static UserInfo query(String userName, String pwd,Iterator<UserInfo> iterator) {
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            if(userName.equals(userInfo.getUserName()) && pwd.equals(userInfo.getUserPwd())){
                return userInfo;
            }
        }
        return null;
    }
}
