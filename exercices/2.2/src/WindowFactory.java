public abstract class WindowFactory {
    public static WindowFactory getFactory(String type) {
        switch (type) {
        case "swing":
            return SwingFactory.getInstance();
        case "swt":
        default:
            return SwtFactory.getInstance();
        }
    }

    public abstract Button createButton();

    public abstract Edit createEdit();

    public abstract Label createLabel();
}