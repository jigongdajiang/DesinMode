package gjg.com.desinmode.d06_bridge.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 具体实现化
 */


public class Dp1Drawing implements Drawing{
    private Dp1 mDp1;

    public Dp1Drawing(Dp1 dp1) {
        this.mDp1 = dp1;
    }

    @Override
    public void drawRect() {
        mDp1.drawRectByDp1();
    }

    @Override
    public void drawCircle() {
        mDp1.drawCircleByDp1();
    }
}
