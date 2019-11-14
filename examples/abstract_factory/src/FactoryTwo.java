public class FactoryTwo extends AbstractFactory {
    public FactoryTwo() {
        System.out.println("Create FactoryTwo");
    }

    @Override
    public ProductTwoA createProductA() {
        return new ProductTwoA();
    }

    @Override
    public ProductTwoB createProductB() {
        return new ProductTwoB();
    }
}