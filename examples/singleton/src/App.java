class App {
    public static void main(String[] args) {
        MySingelton s1 = MySingelton.get_instance();
        s1.test_object("John Doe");

        MySingelton s2 = MySingelton.get_instance();
        s2.test_object("Jane Dae");

        if (s1 == s2) {
            System.out.println("Oh, this is the same object");
        }
    }
}