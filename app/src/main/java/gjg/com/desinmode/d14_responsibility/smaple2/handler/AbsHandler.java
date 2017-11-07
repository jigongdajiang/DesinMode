package gjg.com.desinmode.d14_responsibility.smaple2.handler;

import gjg.com.desinmode.d14_responsibility.smaple2.IUserFunction;
import gjg.com.desinmode.d14_responsibility.smaple2.UserInfo;
import gjg.com.desinmode.d14_responsibility.smaple2.iterator.Aggregate;
import gjg.com.desinmode.d14_responsibility.smaple2.iterator.Iterator;

/**
 * @author : gongdaocai
 * @date : 2017/11/6
 * FileName:
 * @description:
 * 抽象处理者接口
 */


public abstract class AbsHandler implements IHandler,IUserFunction,Aggregate<UserInfo>{
    //持有下一个节点的处理者
    protected AbsHandler nextHandler;

    @Override
    public void nextHandler(AbsHandler handler) {
        this.nextHandler = handler;
    }

    @Override
    public UserInfo query(String name, String pwd) {
        Iterator<UserInfo> iterator = interator();
        while (iterator.hasNext()){
            UserInfo userInfo = iterator.next();
            if(name.equals(userInfo.getUserName()) && pwd.equals(userInfo.getUserPwd())){
                return userInfo;
            }
        }
        if(nextHandler != null){
            return nextHandler.query(name,pwd);
        }
        return null;
    }
}
