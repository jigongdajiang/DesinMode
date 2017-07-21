package gjg.com.desinmode.d12_iterator.example;

import java.util.Iterator;

/**
 * @author : gongdaocai
 * @date : 2017/7/18
 * FileName:
 * @description:
 */


public class MilegeArray {
    public Iterator<Milege> iterator(){
        return new MyIterator();
    }
}
