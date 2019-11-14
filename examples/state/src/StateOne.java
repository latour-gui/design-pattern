/**
 * StateOne
 */
public class StateOne implements InterfaceState {
    private static StateOne instance = null;

    private StateOne() {
    }

    public static StateOne instance() {
        if (instance == null) {
            instance = new StateOne();
        }
        return instance;
    }

    @Override
    public void handleA(StateContext c) {
        System.out.println("StateOne is handling A and staying in StateOne");
    }

    @Override
    public void handleB(StateContext c) {
        System.out.println("StateOne is handling B and going to StateTwo");
        c.setState(StateTwo.instance());
    }

}