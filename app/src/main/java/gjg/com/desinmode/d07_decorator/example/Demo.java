package gjg.com.desinmode.d07_decorator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class Demo {
    public void main(){
        ConcreteComponent component = new ConcreteComponent();
        ConcreteDecoratorA decoratorA = new ConcreteDecoratorA();
        decoratorA.setComponent(component);
        ConcreteDecoratorB decoratorB = new ConcreteDecoratorB();
        decoratorB.setComponent(decoratorA);
        decoratorB.operation();
    }
}
