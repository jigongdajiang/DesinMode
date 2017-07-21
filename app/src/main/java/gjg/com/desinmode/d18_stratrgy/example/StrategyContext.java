package gjg.com.desinmode.d18_stratrgy.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *      操作符的策略上下文操作对象
 */


public class StrategyContext {
    private AbsStrategy strategy;

    public StrategyContext(AbsStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(AbsStrategy strategy) {
        this.strategy = strategy;
    }
    public double callc(double a,double b){
        return strategy.callc(a,b);
    }
}
