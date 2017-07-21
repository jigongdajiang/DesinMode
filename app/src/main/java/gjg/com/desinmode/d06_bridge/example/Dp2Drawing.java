package gjg.com.desinmode.d06_bridge.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 具体实现化
 */


public class Dp2Drawing implements Drawing{
    private Dp2 mDp2;

    public Dp2Drawing(Dp2 dp2) {
        this.mDp2 = dp2;
    }

    @Override
    public void drawRect() {
        mDp2.drawRectByDp2();
    }

    @Override
    public void drawCircle() {
        mDp2.drawCircleByDp2();
    }
}
