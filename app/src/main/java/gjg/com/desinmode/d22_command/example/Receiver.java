package gjg.com.desinmode.d22_command.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class Receiver {
    private PersonBean mBean;
    private PersonBean mCacheBean;

    public Receiver(PersonBean bean) {
        this.mBean = bean;
        mCacheBean = mBean;
    }

    public void changeName(String name){
        mBean.setName(name);
    }
    public void unDoChangeName(){
        mBean.setName(mCacheBean.getName());
    }
    public void changeSex(String sex){
        mBean.setSex(sex);
    }
    public void unDoChangeSex(){
        mBean.setSex(mCacheBean.getSex());
    }

}
