public class ControlFlowApp {

    public static void testSwitch(int num){
        switch (num) {
            case 1 : System.out.println("One"); break;
            case 2 : System.out.println("Two"); break;
            case 3 : System.out.println("Three"); break;
            default : System.out.println("Else"); break;
        }
    }

    public static void main(String[] args) {
        long msl = System.currentTimeMillis();
        System.out.println("Using for...");
        for (int j = 0 ; j < 10; j++){
            System.out.println(j);
        }
        System.out.println("Using while...");
        int idx = 0;
        while (idx < 10){
            System.out.println(idx);
            idx++;
        }
        System.out.println("Using Do While...");
        idx = 0;
        do {
            System.out.println(idx);
            idx++;
        } while (idx < 10);

        long ms2 = System.currentTimeMillis();
        System.out.println("Time millis=" + (ms2-msl));

        if (ms2 % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }

        testSwitch(2);
        testSwitch(1);
        testSwitch(5);

    }
}
