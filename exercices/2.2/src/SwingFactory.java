/**
 * SwiftFactory
 */
public class SwingFactory extends WindowFactory {
    private static SwingFactory instance = null;

    private SwingFactory() {
    }

    public static SwingFactory getInstance() {
        if (instance == null) {
            instance = new SwingFactory();
        }
        return instance;
    }

    @Override
    public SwingButton createButton() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SwingEdit createEdit() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SwingLabel createLabel() {
        // TODO Auto-generated method stub
        return null;
    }

}