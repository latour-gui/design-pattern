/**
 * App
 */
public class App {
    public static void main(String[] args) {
        WindowFactory factory = WindowFactory.getFactory("swing");

        factory.createButton();
        factory.createEdit();
        factory.createLabel();
    }
}