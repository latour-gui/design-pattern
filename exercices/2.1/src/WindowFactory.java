public abstract class WindowFactory {
    public static WindowFactory getFactory(String type) {
        switch (type) {
        case "swing":
            return new SwingFactory();
        case "swt":
        default:
            return new SwtFactory();
        }
    }

    public abstract Button createButton();

    public abstract Edit createEdit();

    public abstract Label createLabel();
}