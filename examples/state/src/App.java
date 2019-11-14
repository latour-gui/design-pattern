/**
 * App
 */
public class App {

    public static void main(String[] args) {
        StateContext manipulable_object = new StateContext();

        manipulable_object.handleA();
        manipulable_object.handleA();
        manipulable_object.handleB();
        manipulable_object.handleB();
        manipulable_object.handleB();
        manipulable_object.handleA();

        // OUTPUT
        //
        // StateOne is handling A and staying in StateOne
        // StateOne is handling A and staying in StateOne
        // StateOne is handling B and going to StateTwo
        // StateTwo is handling B and staying in StateTwo
        // StateTwo is handling B and staying in StateTwo
        // StateTwo is handling A and going to StateOne
    }
}