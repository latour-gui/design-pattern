public class ProductTwoB extends AbstractProductB {
    public ProductTwoB() {
        System.out.println("Create ProductTwoB");
    }

    @Override
    public void other_action() {
        this.set_thing("Other action from Product Two B");
    }
}