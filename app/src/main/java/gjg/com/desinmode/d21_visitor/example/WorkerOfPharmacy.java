package gjg.com.desinmode.d21_visitor.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 具体访问者 药房工作员
 */


public class WorkerOfPharmacy extends Visitor{
    @Override
    public void visit(MedicineA a) {
        System.out.println("药房工作者：" + name + "拿药 ：" + a.getName());
    }

    @Override
    public void visit(MedicineB b) {
        System.out.println("药房工作者：" + name + "拿药 ：" + b.getName());
    }
}
