/**
 * SWTFactory
 */
public class SwtFactory extends WindowFactory {
    private static SwtFactory instance = null;

    private SwtFactory() {
    }

    public static SwtFactory getInstance() {
        if (instance == null) {
            instance = new SwtFactory();
        }
        return instance;
    }

    @Override
    public SwtButton createButton() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SwtEdit createEdit() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public SwtLabel createLabel() {
        // TODO Auto-generated method stub
        return null;
    }

}