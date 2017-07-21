package gjg.com.desinmode.d09_adapter.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/19
 * FileName:
 * @description:
 */


public class ObjAdapter implements Target5Volt {
    private Adapee220Volt adapee220Volt;

    public ObjAdapter(Adapee220Volt adapee220Volt) {
        this.adapee220Volt = adapee220Volt;
    }

    public void get220Volt(){
        adapee220Volt.get220Volt();
    }
    @Override
    public int get5Volt() {
        return 5;
    }
}
