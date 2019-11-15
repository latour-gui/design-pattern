import java.util.HashMap;

/**
 * ContextualSingleton
 */
public class ContextualSingleton {

    private static HashMap<String, ContextualSingleton> instances = new HashMap<>();

    private ContextualSingleton(Object o) {
        System.out.println("Create new instance for " + o.getClass().getName());
    }

    public static ContextualSingleton instance(Object o) {
        String object_class = o.getClass().getName();
        if (!instances.containsKey(object_class)) {
            instances.put(object_class, new ContextualSingleton(o));
        }
        return instances.get(object_class);
    }

}