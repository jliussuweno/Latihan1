import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class RandomAngka {

    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        int menu = 0;
        int length;
        String fileName = "source.txt";
        String fileNameSort = "number.txt";
        FileOutputStream fileOutputStream = null;
        PrintStream printStream = null;

        while (menu != 3) {
            System.out.println("======================");
            System.out.println("Random & Sorting Angka");
            System.out.println("======================");
            System.out.println("1. Input angka random ke dalam file 'source.txt'");
            System.out.println("2. Sorting angka dari file 'source.txt' ke dalam file 'number.txt");
            System.out.println("3. Exit");
            System.out.print("Input : ");
            try {
                menu = Integer.parseInt(stdin.readLine());
                if (menu == 1){
                    System.out.print("Input Panjang Angka : ");
                    try {
                        length = Integer.parseInt(stdin.readLine());

                        try {
                            fileOutputStream = new FileOutputStream(fileName);
                            printStream = new PrintStream(fileOutputStream);
                            int min = 0;
                            int max = 999;

                            for (int i=0; i < length; i++){
                                double random_double = Math.random() * (max - min + 1) + min;
                                if (random_double >= 0 && random_double < 10){
                                    int temp = (int)random_double;
                                    printStream.println( "00" + temp);
                                } else if (random_double >= 10 && random_double < 100) {
                                    int temp = (int)random_double;
                                    printStream.println( "0" + temp);
                                } else {
                                    int temp = (int)random_double;
                                    printStream.println(temp);
                                }
                            }
                            System.out.println("Write to the file 'source.txt' success");
                        } catch (IOException io){
                            io.printStackTrace();
                        } finally {
                            try {
                                assert printStream != null;
                                printStream.close();
                                fileOutputStream.close();
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }

                    } catch (NumberFormatException nfe) {
                        System.out.println("You must be input number value!");
                        System.out.println("System Terminate");
                    } catch (Exception e){
                        e.printStackTrace();
                    }
                } else if (menu == 2){

                    String message;
                    FileInputStream fileInputStream = null;
                    BufferedReader bufferedReader = null;

                    try {
                        ArrayList<Integer> list = new ArrayList<>();
                        fileInputStream = new FileInputStream(fileName);
                        bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                        while ((message = bufferedReader.readLine()) != null){
                            int temp = Integer.parseInt(message);
                            list.add(temp);
                        }

                        Collections.sort(list);
                        System.out.println(list);
                        System.out.println("Sort Number to the file 'number.txt' success");

                        try {
                            fileOutputStream = new FileOutputStream(fileNameSort);
                            printStream = new PrintStream(fileOutputStream);

                            for (int temp : list) {
                                if (temp >= 0 && temp < 10) {
                                    printStream.println("00" + temp);
                                } else if (temp >= 10 && temp < 100) {
                                    printStream.println("0" + temp);
                                } else {
                                    printStream.println(temp);
                                }
                            }
                        } catch (IOException io){
                            io.printStackTrace();
                        } finally {
                            try {
                                assert printStream != null;
                                printStream.close();
                                fileOutputStream.close();
                            } catch (IOException e){
                                e.printStackTrace();
                            }
                        }
                    } catch (IOException e){
                        e.printStackTrace();
                    } finally {
                        try {
                            assert bufferedReader != null;
                            bufferedReader.close();
                            fileInputStream.close();
                        } catch (IOException e){
                            e.printStackTrace();
                        }
                    }
                }
            } catch (Exception io){
                io.printStackTrace();
            }
        }
    }
}
