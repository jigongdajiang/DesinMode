package gjg.com.desinmode.d19_state.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class YellowState implements State {
    @Override
    public void handlePush(StateContext context) {
        context.setState(new BlueState());
    }

    @Override
    public void handlePull(StateContext context) {
        context.setState(new RedState());
    }

    @Override
    public String getColor() {
        return null;
    }
}
