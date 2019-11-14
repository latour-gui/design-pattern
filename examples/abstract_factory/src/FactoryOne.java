public class FactoryOne extends AbstractFactory {
    public FactoryOne() {
        System.out.println("Create FactoryOne");
    }

    @Override
    public ProductOneA createProductA() {
        return new ProductOneA();
    }

    @Override
    public ProductOneB createProductB() {
        return new ProductOneB();
    }

}