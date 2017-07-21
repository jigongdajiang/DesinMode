package gjg.com.desinmode.d17_interpreter.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description:
 *
 *  实现一个算数表达式  (a*b)/((a-b)+c)
 */


public class Demo {
    public void main(){
        Context context = new Context();
        context.add('a',7);
        context.add('b',8);
        context.add('c',2);
        MultiNonterminalExpression multiA = new MultiNonterminalExpression(new TerminalExpression(context.getValue('a')),new TerminalExpression(context.getValue('b')));
        SubNonterminalExpression subA = new SubNonterminalExpression(new TerminalExpression(context.getValue('a')),new TerminalExpression(context.getValue('b')));
        AddNonterminalExpression addA = new AddNonterminalExpression(subA,new TerminalExpression(context.getValue('c')));
        DivNonterminalExpression divA = new DivNonterminalExpression(multiA,addA);
        divA.interpreter(context);
    }
}
