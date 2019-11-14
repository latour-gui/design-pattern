public class App {
    public static void main(String[] args) {
        // use our abstract factory to create a concrete factory
        AbstractFactory one = AbstractFactory.getFactory("one");

        // use our factory to process some objects
        AbstractProductA one_a = one.createProductA();
        AbstractProductB one_b = one.createProductB();

        // we can use the objects
        one_a.action();
        System.out.println(one_a.get_param());
        one_b.other_action();
        System.out.println(one_b.get_thing());

        // Test with the other factory
        // use our abstract factory to create another concrete factory
        AbstractFactory two = AbstractFactory.getFactory("Two");

        // use this new factory to process some objects
        AbstractProductA two_a = two.createProductA();
        AbstractProductB two_b = two.createProductB();

        // we can use the objects
        two_a.action();
        System.out.println(two_a.get_param());
        two_b.other_action();
        System.out.println(two_b.get_thing());

        // OUTPUT :
        //
        // Create FactoryOne
        // Create ProductOneA
        // Create ProductOneB
        // Action from product One A
        // Other action from Product One B
        // Create FactoryTwo
        // Create ProductTwoA
        // Create ProductTwoB
        // Action from Product Two A
        // Other action from Product Two B
    }
}