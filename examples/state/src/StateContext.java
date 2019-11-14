/**
 * Context
 */
public class StateContext {
    private InterfaceState currentState;

    public StateContext() {
        this.currentState = StateOne.instance();
    };

    public void setState(InterfaceState in) {
        this.currentState = in;
    }

    public void handleA() {
        this.currentState.handleA(this);
    }

    public void handleB() {
        this.currentState.handleB(this);
    }

}