public class SystemProApp {
    public static void main(String[] args){
        String ipAddress = System.getProperty("ip.address");
        DummyConnection conn = new DummyConnection();
        conn.connect(ipAddress);
    }
}
