public abstract class AbstractFactory {
    public static AbstractFactory getFactory(String number) {
        if (number.equals("Two")) {
            return new FactoryTwo();
        }
        return new FactoryOne();
    }

    public abstract AbstractProductA createProductA();

    public abstract AbstractProductB createProductB();
}