package gjg.com.desinmode.d14_responsibility.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *  程序员抽象接口
 */


public abstract class ProgramApes {
    /**
     * 获取程序员具体的出差费用
     * @return
     */
    public abstract int getExpenses();

    /**
     * 申请描述
     * @return
     */
    public abstract String getApply();
}
