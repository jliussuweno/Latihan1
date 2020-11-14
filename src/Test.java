import java.net.SecureCacheResponse;
import java.util.*;

public class Test {

    public static void main(String[] args) {
//        fibonacci(10);
//        minMax();
//        bilanganPrimaGanjilGenap(7);
//        bilanganPrima();
//        bilanganGanjil();
//        bilanganGenap();
//        deretFibonacci();
//        hitungBunga(850000);
//        hitungKembalian(165000, 0.15, 150000);
//        hitungSisaStock(6, 4, 2);
//        belanja(220000);
//        printWeird(12);
        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));

    }

    public static String highAndLow(String numbers) {
        // Code here or
        String[] tempNum = numbers.split(" ");
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 0; i < tempNum.length; i++){
            nums.add(Integer.parseInt(tempNum[i]));
        }
        Collections.sort(nums);
        String temp1 = String.valueOf(nums.get(0));
        String temp2 = String.valueOf(nums.get(nums.size() - 1));
        String result = temp2 + " " + temp1;
        return result;
    }

    private static void printWeird(int number) {
        if (number >= 1 && number <= 100){
            if (number % 2 == 0 && number >= 2 && number <= 5){
                System.out.println("not weird");
            }

            if (number % 2 == 0 && number >= 6 && number <= 20){
                System.out.println("weird");
            }

            if (number % 2 == 0 && number > 20){
                System.out.println("not weird");
            }

            if (number % 2 != 0){
                System.out.println("weird");
            }
        }
    }

    private static void belanja(long payment) {
        if (payment >= 50000 && payment <= 100000){
            System.out.println("Celana Pendek");
        } else if (payment > 100000 && payment <= 225000){
            System.out.println("Kaos");
        } else if (payment > 225000 && payment <= 350000){
            System.out.println("Kemeja");
        } else if (payment > 350000 && payment <= 750000){
            System.out.println("Celana Panjang");
        } else if (payment > 750000){
            System.out.println("Jas");
        } else {
            System.out.println("Tidak Dapat Apa-Apa");
        }

    }

    private static void hitungSisaStock(int stock, int tio, int david){
        int lusin = 12;
        int gros = 144;
        System.out.println(stock*gros);
        System.out.println(tio*lusin);
        System.out.println(david*gros);
        System.out.println(stock*gros - tio*lusin - david*gros);
    }

    private static void hitungKembalian(long money, double discount, long payment){
        long price = (long) (money * discount);
        System.out.println(payment - (money - price));
    }


    private static void hitungBunga(long money) {
        System.out.println(money * 0.05);
    }

    private static void deretFibonacci() {
        int number1 = 0;
        int number2 = 1;
        int number3 = 0;

        do {
            System.out.print(number2 + " ");
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
        } while (number2 <= 100);
    }

    private static void bilanganGenap() {
        for (int i=1; i <= 100; i++){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    private static void bilanganGanjil() {
        for (int i=1; i<=100; i++){
            if (i % 2 != 0){
                System.out.print(i + " ");
            }
        }
    }

    private static void bilanganPrima() {

        for (int i = 1; i <= 100; i++){
            int temp = 0;
            for (int j = 1; j<=i; j++){
                if (i % j == 0){
                    temp++;
                }
            }
            if (temp == 2){
                System.out.print(i + " ");
            }
        }
    }

    public static void fibonacci(int num){
        int num1=0;
        int num2=1;
        int num3=0;

        for (int i =0; i < num; i++){
            System.out.print(num2 + " ");
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
    }

    public static void minMax(){
        int min =0;
        int max= 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas angka: [1-100]");

        try {
            int length = input.nextInt();
            System.out.println();
            for (int i = 0; i < length; i++){
                System.out.print("Masukkan Angka ke " + (i+1));

                try {
                    int currentNum = input.nextInt();

                    if (i == 0){
                        min = currentNum;
                        max = currentNum;
                    }

                    if (currentNum > max){
                        max = currentNum;
                    }

                    if (currentNum < min){
                        min = currentNum;
                    }

                } catch (NumberFormatException nfe){
                    System.out.println("Masukkan kembali angka dengan benar!");
                } catch (Exception e){
                    System.out.println("Terjadi kesalahan, silahkan ulangi program kembali!");
                }

            }
        } catch (NumberFormatException nfe){
            System.out.println("Masukkan kembali angka dengan benar!");
        } catch (Exception e){
            System.out.println("Terjadi kesalahan, silahkan ulangi program kembali!");
        }

        System.out.println("Maximal Number = " + max);
        System.out.println("Minimal Number = " + min);

    }

    public static void bilanganPrimaGanjilGenap(int num){
        String result = String.valueOf(num);
        if (num % 2 == 0){
            result += " Bilangan Genap";
        }

        if (num % 2 != 0){
            result += " Bilangan Ganjil";
        }
        int temp = 0;
        for (int i = 1; i <= num; i++){

            if (num%i == 0){
                temp++;
                System.out.println("temp" + temp);
            }
        }
        if (temp == 2){
            result += " Bilangan Prima";
        }


        System.out.println(result);
    }

}
