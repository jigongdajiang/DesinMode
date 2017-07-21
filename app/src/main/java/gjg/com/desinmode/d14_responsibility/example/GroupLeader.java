package gjg.com.desinmode.d14_responsibility.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class GroupLeader extends Leader {
    public GroupLeader() {
        super(1000);
    }

    @Override
    protected void reply(ProgramApes ape) {
        System.out.println(ape.getApply());
        System.out.println("GroupLeader Handled  Ok Go!");
    }
}
