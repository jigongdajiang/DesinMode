package gjg.com.desinmode.d07_decorator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class ConcreteDecoratorB extends Decorator {
    @Override
    public void operation() {
        super.operation();
        expendActionB();
    }

    private void expendActionB() {
        System.out.println("装饰B");
    }
}
