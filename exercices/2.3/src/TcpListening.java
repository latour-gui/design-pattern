/**
 * TcpListening
 */
public class TcpListening extends TcpState {
    private static TcpListening instance = null;

    private TcpListening() {
        System.out.println("Creating new TCP state : Listening");
    }

    public static TcpListening instance() {
        if (instance == null) {
            instance = new TcpListening();
        }
        return instance;
    }

    @Override
    public void close(Socket s) {
        System.out.println("Call to 'close' => switch to state Closed");
        s.setState(TcpClosed.instance());
    }

    public void connect(Socket s) {
        System.out.println("Call to 'connect' => switch to state Error");
        s.setState(TcpError.instance());
    }

    public void read(Socket s) {
        System.out.println("Call to 'read' => do some stuff");
    }

    public void write(Socket s) {
        System.out.println("Call to 'write' => do some other stuff");
    }

}
