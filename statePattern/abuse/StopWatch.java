package statePattern.abuse;

public class StopWatch {
    private State state = new StoppedState(this);

    public void click(){
       state.click();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
