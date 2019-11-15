import java.util.HashMap;

/**
 * Session
 */
public class Session {

    private static HashMap<String, Session> instances = new HashMap<>();

    private Session(String ip) {
        System.out.println("Create session for ip <" + ip + ">");
    }

    public static Session instance(String ip) {
        if (!instances.containsKey(ip)) {
            instances.put(ip, new Session(ip));
        }

        System.out.println("Giving session for ip <" + ip + ">");
        return instances.get(ip);
    }
}