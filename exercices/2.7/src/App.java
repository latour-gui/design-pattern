/**
 * App
 */
public class App {

    public static void main(String[] args) {
        TypeA type_one = new TypeA();
        TypeB type_two = new TypeB();
        TypeC type_three = new TypeC();

        ContextualSingleton singleton_one = ContextualSingleton.instance(type_one);
        ContextualSingleton singleton_two = ContextualSingleton.instance(type_two);
        ContextualSingleton singleton_three = ContextualSingleton.instance(type_three);

        ContextualSingleton singleton_one_bis = ContextualSingleton.instance(type_one);
        ContextualSingleton singleton_two_bis = ContextualSingleton.instance(type_two);
        ContextualSingleton singleton_three_bis = ContextualSingleton.instance(type_three);

        assert (singleton_one == singleton_one_bis);
        assert (singleton_two == singleton_two_bis);
        assert (singleton_three == singleton_three_bis);

        // OUTPUT
        //
        // Create new instance for TypeA
        // Create new instance for TypeB
        // Create new instance for TypeC
    }
}