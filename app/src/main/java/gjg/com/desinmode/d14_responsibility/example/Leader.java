package gjg.com.desinmode.d14_responsibility.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public abstract class Leader implements IPower{
    private int mExpenses;//当前领导能批复的金额
    private Leader mSuperLeader;//上级领导

    public Leader(int expenses) {
        this.mExpenses = expenses;
    }

    public void setmSuperLeader(Leader superLeader) {
        this.mSuperLeader = superLeader;
    }
    protected abstract void reply(ProgramApes ape);

    @Override
    public void handleRequest(ProgramApes ape) {
        if(ape.getExpenses() <= mExpenses){
            //当前领导有权限处理
            reply(ape);
        }else{
            if(null != mSuperLeader){
                mSuperLeader.handleRequest(ape);
            }
        }
    }
}
