public class ProductOneA extends AbstractProductA {
    public ProductOneA() {
        System.out.println("Create ProductOneA");
    }

    @Override
    public void action() {
        this.set_param("Action from product One A");
    }
}