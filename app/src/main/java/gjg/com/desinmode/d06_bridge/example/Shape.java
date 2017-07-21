package gjg.com.desinmode.d06_bridge.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 *  抽象化角色
 */


public abstract class Shape {
    private Drawing mDrawing;

    public Shape(Drawing drawing) {
        this.mDrawing = drawing;
    }
    public abstract void draw();

    protected void drawRect(){
        mDrawing.drawRect();
    }
    protected void drawCircle(){
        mDrawing.drawCircle();
    }
}
