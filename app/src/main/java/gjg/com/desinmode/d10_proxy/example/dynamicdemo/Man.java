package gjg.com.desinmode.d10_proxy.example.dynamicdemo;

/**
 * @author : gongdaocai
 * @date : 2017/11/5
 * FileName:
 * @description: 被代理对象
 */


public class Man implements IBank {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    @Override
    public void applyCard() {
        System.out.println(name+"申请办卡");
    }

    @Override
    public void reportCard(String cardNumber) {
        System.out.println(name+"挂失卡，卡号="+cardNumber);
    }
}
