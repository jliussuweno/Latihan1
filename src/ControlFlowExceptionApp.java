public class ControlFlowExceptionApp {

    public static void main(String[] args){
        test(args);
    }

    private static void test(String[] args){
        int val = 0;
        try {
            val = Integer.parseInt(args[0]);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e.toString());
            e.printStackTrace();
            val += 1;
            return;
        } finally {
            val += 5;
            System.out.println("Val = " + val);
        }

    }
}
