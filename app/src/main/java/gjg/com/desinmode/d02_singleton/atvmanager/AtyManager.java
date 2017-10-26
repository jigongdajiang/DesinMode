package gjg.com.desinmode.d02_singleton.atvmanager;

import android.app.Activity;

import java.util.Stack;

/**
 * @author : gongdaocai
 * @date : 2017/10/26
 * FileName:
 * @description: 使用场景
 * 跨多页面返回
 * 例如
 * 从详情页--->登录页--->到注册页 注册成功后返回到详情页
 * 单点登录--->登录页--->到注册页 注册成功后返回到被挤下线时的页面
 */


public class AtyManager {
    private static volatile AtyManager mInstance;

    //删除，添加交频繁，采用链表存储
    private Stack<Activity> mActivities;

    private AtyManager() {
        mActivities = new Stack<>();
    }

    public static AtyManager getInstance() {
        if (null == mInstance) {
            synchronized (AtyManager.class) {
                if (null == mInstance) {
                    mInstance = new AtyManager();
                }
            }
        }
        return mInstance;
    }

    public void attach(Activity activity) {
        if (activity != null) {
            mActivities.add(activity);
        }
    }

    /**
     * 防止内存泄露
     * 这里传统的for循环直接遍历删除会出问题，这里参考EventBus移除的算法
     * @param detachActivity
     */
    public void detach(Activity detachActivity) {
//        for (Activity activity : mActivities) {
//            if (detachActivity == activity) {
//                mActivities.remove(activity);
//            }
//        }
        int size = mActivities.size();
        for(int i=0;i<size;i++){
            Activity activity = mActivities.get(i);
            if(detachActivity == activity){
                mActivities.remove(i);
                i--;
                size--;
            }
        }
    }

    /**
     * 关闭某个Activity
     */
    public void finish(Activity finishActivity) {
        int size = mActivities.size();
        for(int i=0;i<size;i++){
            Activity activity = mActivities.get(i);
            if(finishActivity == activity){
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    /**
     * 关闭某个Activity
     */
    public void finish(Class<? extends Activity> finishActivityClass) {
        int size = mActivities.size();
        for(int i=0;i<size;i++){
            Activity activity = mActivities.get(i);
            if(finishActivityClass.getCanonicalName().equals(activity.getClass().getCanonicalName())){
                mActivities.remove(i);
                activity.finish();
                i--;
                size--;
            }
        }
    }

    /**
     * 退出整个应用
     */
    public void exitApp() {
        for (int i = 0, size = mActivities.size(); i < size; i++) {
            if (null != mActivities.get(i)) {
                mActivities.get(i).finish();
            }
        }
        mActivities.clear();
    }

    /**
     * 获取当前的Activity
     * 例如当收到单点下线通知时应弹窗，弹窗需要基于当前Activity
     * 这样就能在广播或者服务里面实现弹窗了
     */
    public Activity currentActivity() {
        return mActivities.lastElement();
    }

    /**
     * 判断是否包含activity
     */
    public  Boolean isContainActivity(Class<?> cls) {
        for (Activity activity : mActivities) {
            if (activity.getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }
}
