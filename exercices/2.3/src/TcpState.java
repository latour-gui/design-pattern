/**
 * TcpState
 */
public abstract class TcpState {

    public void close(Socket s) {
        System.out.println("Call to 'close' -> Error !!");
    }

    public void connect(Socket s) {
        System.out.println("Call to 'connect' -> Error !!");
    }

    public void read(Socket s) {
        System.out.println("Call to 'read' -> Error !!");
    }

    public void write(Socket s) {
        System.out.println("Call to 'write' -> Error !!");
    }

}
