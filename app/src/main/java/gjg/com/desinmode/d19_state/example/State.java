package gjg.com.desinmode.d19_state.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public interface State {
    void handlePush(StateContext context);
    void handlePull(StateContext context);
    String getColor();
}
