package gjg.com.desinmode.d12_iterator.smaple1;

import java.util.List;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 */


public class Client {
    public static void main(String[] args){
        // 根据用户名和密码 去两个系统中查询用户信息
        UserInfo loginUserInfo = queryFromWx("GG","123456");
        if(null == loginUserInfo){
            loginUserInfo = queryFromQQ("GG","123456");
        }
        if(loginUserInfo != null){
            System.out.println("登录成功-->"+loginUserInfo.getUserName());
        }else{
            System.out.println("登录失败,用户名密码错误");
        }
    }

    private static UserInfo queryFromQQ(String userName, String pwd) {
        QQUserSystem qqUserSystem = new QQUserSystem();
        List<UserInfo> userInfos = qqUserSystem.getUserInfos();
        for (UserInfo userInfo : userInfos) {
            if(userName.equals(userInfo.getUserName()) && pwd.equals(userInfo.getUserPwd())){
                return userInfo;
            }
        }
        return null;
    }

    private static UserInfo queryFromWx(String userName, String pwd) {
        WxUserSystem qqUserSystem = new WxUserSystem();
        UserInfo[] userInfos = qqUserSystem.getUserInfos();
        for (UserInfo userInfo : userInfos) {
            if(userName.equals(userInfo.getUserName()) && pwd.equals(userInfo.getUserPwd())){
                return userInfo;
            }
        }
        return null;
    }
}
