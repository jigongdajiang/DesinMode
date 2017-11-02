package gjg.com.desinmode.d01_factorymethod.iofram;

import android.util.LruCache;

/**
 * @author : gongdaocai
 * @date : 2017/11/2
 * FileName:
 * @description:
 */


public class MemoryIOHandler implements IIOHander {
    private LruCache<String,String> mCache = new LruCache<>(10*1024*1024);
    @Override
    public void save(String k, String v) {
        mCache.put(k,v);
    }

    @Override
    public String get(String k) {
        return mCache.get(k);
    }

    @Override
    public void remove(String k) {
        mCache.remove(k);
    }
}
