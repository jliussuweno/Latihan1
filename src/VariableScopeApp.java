public class VariableScopeApp {
    public static void main(String[] args) {
        System.out.println("a = " + 10);
        System.out.println("b = " + 3);
        Calculator calculator = new Calculator();
        int d = calculator.diff(10, 3);
        int last = calculator.getLastResult();
        System.out.println("Diff = " + d);
        System.out.println("Last Result = " + last);

    }
}
