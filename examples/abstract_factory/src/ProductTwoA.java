public class ProductTwoA extends AbstractProductA {
    public ProductTwoA() {
        System.out.println("Create ProductTwoA");
    }

    @Override
    public void action() {
        this.set_param("Action from Product Two A");
    }
}