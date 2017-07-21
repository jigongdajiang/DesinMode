package gjg.com.desinmode.d14_responsibility.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class Boss extends Leader {
    public Boss() {
        super(10000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("Boss Handled  Ok Go!");
    }
}
