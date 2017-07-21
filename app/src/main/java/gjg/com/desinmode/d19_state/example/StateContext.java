package gjg.com.desinmode.d19_state.example;

/**
 * @author : gongdaocai
 * @date : 2017/7/21
 * FileName:
 * @description:
 */


public class StateContext {
    private State state = null;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
    public void push(){
        state.handlePush(this);
    }
    public void pull(){
        state.handlePull(this);
    }
}
