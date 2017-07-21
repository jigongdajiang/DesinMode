package gjg.com.desinmode.d17_interpreter.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class TerminalExpression implements AbsExpression {
    private final int i;

    public TerminalExpression(int i) {
        this.i = i;
    }

    @Override
    public int interpreter(Context context) {
        return i;
    }
}
