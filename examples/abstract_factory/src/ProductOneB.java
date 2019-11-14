public class ProductOneB extends AbstractProductB {
    public ProductOneB() {
        System.out.println("Create ProductOneB");
    }

    @Override
    public void other_action() {
        this.set_thing("Other action from Product One B");
    }
}