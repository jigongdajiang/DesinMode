package gjg.com.desinmode.d18_stratrgy.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class MultiStrategy implements AbsStrategy {
    @Override
    public double callc(double a, double b) {
        return a*b;
    }
}
