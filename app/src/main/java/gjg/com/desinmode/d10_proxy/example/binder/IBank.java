package gjg.com.desinmode.d10_proxy.example.binder;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 *  Binder接口
 */


public interface IBank extends IInterface {
    static final String DESCRIPTOR = "gjg.com.desinmode.proxy.example.binder.IBank";
    static final int TRANSACTION_queryMoney = (IBinder.FIRST_CALL_TRANSACTION+0);
    long queryMoney(int uid) throws RemoteException;
}
