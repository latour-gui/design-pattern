class MySingelton {
    private static MySingelton instance = null;

    private MySingelton() {
        System.out.println("creating singleton");
    }

    public static MySingelton get_instance() {
        if (instance == null) {
            instance = new MySingelton();
        }
        return instance;
    }

    public void test_object(String name) {
        System.out.println("Bonjour, " + name);
    }
}