/**
 * App
 */
public class App {

    public static void main(String[] args) {
        String ip_one = "127.0.0.1";
        String ip_two = "172.16.0.1";
        String ip_three = "192.168.0.1";

        Session sess_one = Session.instance(ip_one);
        Session sess_two = Session.instance(ip_two);
        Session sess_three = Session.instance(ip_three);

        Session sess_one_bis = Session.instance(ip_one);
        Session sess_two_bis = Session.instance(ip_two);
        Session sess_three_bis = Session.instance(ip_three);

        assert (sess_one == sess_one_bis);
        assert (sess_two == sess_two_bis);
        assert (sess_three == sess_three_bis);

        // OUTPUT
        //
        // Create session for ip <127.0.0.1>
        // Giving session for ip <127.0.0.1>
        // Create session for ip <172.16.0.1>
        // Giving session for ip <172.16.0.1>
        // Create session for ip <192.168.0.1>
        // Giving session for ip <192.168.0.1>
        // Giving session for ip <127.0.0.1>
        // Giving session for ip <172.16.0.1>
        // Giving session for ip <192.168.0.1>
    }
}