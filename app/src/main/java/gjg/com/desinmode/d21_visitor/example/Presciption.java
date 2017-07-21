package gjg.com.desinmode.d21_visitor.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description: 对象结构
 */


public class Presciption {
    List<Medicine> list = new ArrayList<Medicine>();

    public void accept(Visitor visitor){
        Iterator<Medicine> iterator = list.iterator();

        while (iterator.hasNext()) {
            iterator.next().accept(visitor);
        }
    }

    public void addMedicine(Medicine medicine){
        list.add(medicine);
    }

    public void removeMedicien(Medicine medicine){
        list.remove(medicine);
    }
}
