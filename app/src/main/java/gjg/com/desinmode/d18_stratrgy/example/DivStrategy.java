package gjg.com.desinmode.d18_stratrgy.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class DivStrategy implements AbsStrategy {
    @Override
    public double callc(double a, double b) {
        return a/b;
    }
}
