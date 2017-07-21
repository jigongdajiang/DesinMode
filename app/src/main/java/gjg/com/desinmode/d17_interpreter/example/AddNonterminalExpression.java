package gjg.com.desinmode.d17_interpreter.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 */


public class AddNonterminalExpression implements AbsExpression {
    private AbsExpression left,right;

    public AddNonterminalExpression(AbsExpression left, AbsExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpreter(Context context) {
        return left.interpreter(context) + right.interpreter(context);
    }
}
