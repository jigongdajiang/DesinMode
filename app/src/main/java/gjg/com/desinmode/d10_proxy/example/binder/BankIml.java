package gjg.com.desinmode.d10_proxy.example.binder;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class BankIml extends Binder implements IBank {
    public BankIml() {
        this.attachInterface(this,DESCRIPTOR);
    }
    public static IBank asInterface(IBinder obj){
        if(obj == null){
            return null;
        }
        IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
        if((iin != null) && (iin instanceof IBank)){
            return (IBank) iin;
        }
        return new BankIml.Proxy(obj);

    }
    @Override
    public long queryMoney(int uid) throws RemoteException {
        return uid * 101;
    }

    @Override
    public IBinder asBinder() {
        return this;
    }

    @Override
    protected boolean onTransact(int code, Parcel data, Parcel reply, int flags) throws RemoteException {
        switch (code){
            case INTERFACE_TRANSACTION: {
                reply.writeString(DESCRIPTOR);
                return true;
            }
            case TRANSACTION_queryMoney: {
                data.enforceInterface(DESCRIPTOR);
                int uid = data.readInt();
                long result = this.queryMoney(uid);
                reply.writeNoException();
                reply.writeLong(result);
                return true;
            }
        }
        return super.onTransact(code, data, reply, flags);
    }
    private static class Proxy implements IBank{
        private IBinder mRemote;

        public Proxy(IBinder remote) {
            this.mRemote = remote;
        }
        public String getInterfaceDescriptor(){
            return DESCRIPTOR;
        }
        @Override
        public long queryMoney(int uid) throws RemoteException {
            Parcel data = Parcel.obtain();
            Parcel reply = Parcel.obtain();
            long result = 0;
            try {
                data.writeInterfaceToken(DESCRIPTOR);
                data.writeInt(uid);
                mRemote.transact(TRANSACTION_queryMoney,data,reply,0);
                reply.readException();
                result = reply.readLong();
            }finally {
                data.recycle();
                reply.recycle();
            }
            return result;
        }

        @Override
        public IBinder asBinder() {
            return mRemote;
        }
    }
}
