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
    /**
     *
     volatile关键字的使用作用
     1. 防止重排序
     当new一个对象的时候会进行如下操作
     s1 开辟一块内存
     s2 初始化对象
     s3 给变量赋值(指向内存地址)
     在java中 s2和s3顺序是不固定的，也就是说有时候会先赋值再初始化对象，所以在单例模式中可能会出现没有赋值或者没有初始化的对象
     加上volatile就是防止线程在执行时按照s1 s2 s3进行而不会出现s1 s3 s2的情况
     2. 线程可见性
     某一个线程改了公用变量，短时间内可能另一个线程可能是不可见的，因为每一个线程都有自己的缓存区(工作区)
     这就可能一个线程创建了单例对象，但是短时间内另一个线程不知道已经创建而重新创建导致创建两遍对象
     加上volatile能让变量对线程可见
     */
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
