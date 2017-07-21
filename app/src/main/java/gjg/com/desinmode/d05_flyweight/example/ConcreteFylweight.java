package gjg.com.desinmode.d05_flyweight.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class ConcreteFylweight implements Flyweight {
    private Character intrinsicState = null;
    /**
     * 构造函数，内蕴状态作为参数传入
     * @param state
     */
    public ConcreteFylweight(Character state){
        this.intrinsicState = state;
    }

    /**
     * 外蕴状态作为参数传入方法中，改变方法的行为，
     * 但是并不改变对象的内蕴状态。
     */
    @Override
    public void operation(String p) {
        System.out.println("Intrinsic State = " + this.intrinsicState);
        System.out.println("Extrinsic State = " + p);
    }
}
