package gjg.com.desinmode.d07_decorator.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 被装饰对象实现
 */


public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("被装饰对象的功能");
    }
}
