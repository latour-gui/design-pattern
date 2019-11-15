/**
 * TcpError
 */
public class TcpError extends TcpState {
    private static TcpError instance = null;

    private TcpError() {
        System.out.println("Creating new TCP state : Error");
    }

    public static TcpError instance() {
        if (instance == null) {
            instance = new TcpError();
        }
        return instance;
    }

    @Override
    public void close(Socket s) {
        System.out.println("Call to 'close' => switch to state Closed");
        s.setState(TcpClosed.instance());
    }
}
