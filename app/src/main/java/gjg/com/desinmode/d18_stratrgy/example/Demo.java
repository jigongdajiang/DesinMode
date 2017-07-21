package gjg.com.desinmode.d18_stratrgy.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class Demo {
    public static double oldMethod(String op, double paramA, double paramB) {
        if ("+".equals(op)) {
            System.out.println("执行加法...");
            return paramA + paramB;
        } else if ("-".equals(op)) {
            System.out.println("执行减法...");
            return paramA - paramB;
        } else if ("*".equals(op)) {
            System.out.println("执行乘法...");
            return paramA * paramB;
        } else if ("/".equals(op)) {
            System.out.println("执行除法...");
            if (paramB == 0) {
                throw new IllegalArgumentException("除数不能为0!");
            }
            return paramA / paramB;
        } else {
            throw new IllegalArgumentException("未找到计算方法!");
        }
    }
    //执行方法
    public static double newMthod(AbsStrategy strategy, double paramA, double paramB) {
        StrategyContext calc = new StrategyContext(strategy);
        return calc.callc(paramA, paramB);
    }
}
