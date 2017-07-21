package gjg.com.desinmode.d09_adapter.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class ClassAdapter extends Adapee220Volt implements Target5Volt {
    @Override
    public int get5Volt() {
        return 5;
    }
}
