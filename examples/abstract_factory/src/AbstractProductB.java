public abstract class AbstractProductB {
    private String thing;

    public String get_thing() {
        return this.thing;
    }

    public void set_thing(String t) {
        this.thing = t;
    }

    public abstract void other_action();
}