public abstract class AbstractProductA {
    private String param;

    public String get_param() {

        return this.param;
    }

    public void set_param(String p) {
        this.param = p;
    }

    public abstract void action();
}