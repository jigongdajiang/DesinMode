package gjg.com.desinmode.d15_memento;

/**
 * @author : gongdaocai
 * @date : 2017/7/20
 * FileName:
 * @description: 备忘录模式
 */


public class Description {
    /**
     * 定义:
     *      在不破坏封装的前提下，捕获一个对象的内部状态,并在该对象之外保存这个状态,这样以后就可以将该对象恢复到原先保存的状态
     * 场景:
     *      必须保存一个对象的某一是个的(可能是部分)状态，这样才能在以后恢复这个状态
     *      保存状态还不能破坏其封装性时
     * 角色:
     *      备忘录角色(Memento):备忘录存储源发器的内部(某些)状态
     *      源发器(Originator):创建一个备忘录，用于记录它的状态，使用备忘录恢复状态
     *      备忘录保存者(Caretaker):负责保存好备忘录,不能对备忘录的内容进行操作
     * 案例:
     *      见example
     * android:
     *      保存Activity状态的onSaveInstanceState（）和恢复Activity状态的onRestoreInstanceState（）
     * 利弊:
     */
}
