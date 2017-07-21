package gjg.com.desinmode.d19_state.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class RedState implements State {
    @Override
    public void handlePush(StateContext context) {
        context.setState(new YellowState());
    }

    @Override
    public void handlePull(StateContext context) {
        context.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "RED";
    }
}
