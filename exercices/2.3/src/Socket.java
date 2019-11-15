/**
 * Socket
 */
public class Socket {

    private TcpState current;

    public Socket() {
        this.current = TcpClosed.instance();
    }

    public void setState(TcpState state) {
        this.current = state;
    }

    public void close() {
        this.current.close(this);
    }

    public void connect() {
        this.current.connect(this);
    }

    public void read() {
        this.current.read(this);
    }

    public void write() {
        this.current.write(this);
    }

}
