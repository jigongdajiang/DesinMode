package gjg.com.desinmode.d21_visitor.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 具体访问者 划价员
 */


public class Charger extends Visitor{
    @Override
    public void visit(MedicineA a) {
        System.out.println("划价员：" + name +"给药" + a.getName() +"划价:" + a.getPrice());
    }

    @Override
    public void visit(MedicineB b) {
        System.out.println("划价员：" + name +"给药" + b.getName() +"划价:" + b.getPrice());
    }
}
