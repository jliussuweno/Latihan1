public class Fibonacci {

    public static void main(String[] args) {
        whileFibonacci(20);
        System.out.println();
        forFibonacci(20);
        System.out.println();
        doFibonacci(20);
    }

    public static void whileFibonacci(int length){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int counter = 0;
        while (counter < length){
            System.out.print(num2 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        }
    }

    public static void forFibonacci(int length){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for (int i=0; i<length; i++){
            System.out.print(num2 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

    }

    public static void doFibonacci(int length){
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        int counter = 0;
        do {
            System.out.print(num2 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            counter++;
        } while (counter < length);
    }

}

