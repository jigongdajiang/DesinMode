package gjg.com.desinmode.d14_responsibility.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class Demo {
    public void main(){
        ProgramApes androidProgram = new AndroidProgeamApes();
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Boss boss = new Boss();
        groupLeader.setmSuperLeader(director);
        director.setmSuperLeader(boss);
        groupLeader.handleRequest(androidProgram);
    }
}
