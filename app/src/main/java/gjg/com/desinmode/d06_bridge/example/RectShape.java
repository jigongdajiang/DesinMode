package gjg.com.desinmode.d06_bridge.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description: 修正抽象化
 */


public class RectShape extends Shape {
    public RectShape(Drawing drawing) {
        super(drawing);
    }

    @Override
    public void draw() {
        drawRect();
    }
}
