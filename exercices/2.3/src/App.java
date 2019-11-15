/**
 * App
 */
public class App {

    public static void main(String[] args) {
        Socket s = new Socket();

        s.close();
        s.read();

        s.connect();
        s.write();
        s.read();
        s.write();
        s.read();
        s.close();

        s.connect();
        s.read();
        s.connect();

        s.read();
        s.write();
        s.close();

        // OUTPUT
        //
        // Creating new TCP state : closed
        // Call to 'close' -> Error !!
        // Call to 'read' -> Error !!
        // Call to 'connect' => switch to state Listening
        // Creating new TCP state : Listening
        // Call to 'write' => do some other stuff
        // Call to 'read' => do some stuff
        // Call to 'write' => do some other stuff
        // Call to 'read' => do some stuff
        // Call to 'close' => switch to state Closed
        // Call to 'connect' => switch to state Listening
        // Call to 'read' => do some stuff
        // Call to 'connect' => switch to state Error
        // Creating new TCP state : Error
        // Call to 'read' -> Error !!
        // Call to 'write' -> Error !!
        // Call to 'close' => switch to state Closed
    }
}
