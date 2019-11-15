/**
 * TcpClosed
 */
public class TcpClosed extends TcpState {
    private static TcpClosed instance = null;

    private TcpClosed() {
        System.out.println("Creating new TCP state : closed");
    }

    public static TcpClosed instance() {
        if (instance == null) {
            instance = new TcpClosed();
        }

        return instance;
    }

    @Override
    public void connect(Socket s) {
        System.out.println("Call to 'connect' => switch to state Listening");
        s.setState(TcpListening.instance());
    }

}
