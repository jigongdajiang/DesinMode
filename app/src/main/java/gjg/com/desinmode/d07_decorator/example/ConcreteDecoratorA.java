package gjg.com.desinmode.d07_decorator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class ConcreteDecoratorA extends Decorator {
    @Override
    public void operation() {
        extendActionA();
        super.operation();
    }

    /**
     * 装饰性功能
     */
    private void extendActionA() {
        System.out.println("装饰A");
    }
}
