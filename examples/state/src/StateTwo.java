/**
 * StateTwo
 */
public class StateTwo implements InterfaceState {

    private static StateTwo instance = null;

    private StateTwo() {
    }

    public static StateTwo instance() {
        if (instance == null) {
            instance = new StateTwo();
        }
        return instance;
    }

    @Override
    public void handleA(StateContext c) {
        System.out.println("StateTwo is handling A and going to StateOne");
        c.setState(StateOne.instance());
    }

    @Override
    public void handleB(StateContext c) {
        System.out.println("StateTwo is handling B and staying in StateTwo");
    }

}