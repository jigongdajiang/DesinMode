package gjg.com.desinmode.d21_visitor.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 抽象访问者
 */


public abstract class Visitor {
    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void visit(MedicineA a);
    public abstract void visit(MedicineB b);
}
