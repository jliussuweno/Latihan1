public class ArgumentTestApp {
    public static void main(String[] args) {
        System.out.println("First arg=" + args[0]);
        System.out.println("Second arg=" + args[1]);
        String addr = args[1];
        DummyConnection connection = new DummyConnection();
        connection.connect(addr);
    }
}
