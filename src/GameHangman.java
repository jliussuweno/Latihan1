import javax.sound.midi.SoundbankResource;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class GameHangman {

        private static String[] words = {"ANGGUR", "APEL", "BELIMBING", "DELIMA", "DUKU", "DURIAN", "JAMBU" };
        private static String word = words[(int) (Math.random() * words.length)];
        private static String asterisk = new String(new char[word.length()]).replace("\0", "*");
        private static int count = 0;
        private static String mainLagi = "";
        private static int menu = 0;
        private static int nyawa = 5;
        private static long ms1;
        private static long ms2;


        public static void main(String[] args) {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            String fileName = "score.txt";
            FileOutputStream fileOutputStream = null;
            PrintStream printStream = null;

            while (menu != 3) {
                System.out.println("======================");
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("1. Main");
                System.out.println("2. Tampilkan High Score (Ascending)");
                System.out.println("3. Keluar");
                System.out.print("Input : ");
                try {
                    ms1 = System.currentTimeMillis();
                    menu = Integer.parseInt(stdin.readLine());
                    if (menu == 1){
                        asterisk = new String(new char[word.length()]).replace("\0", "*");
                        System.out.println("HANGMAN BUAH-BUAHAN");
                        System.out.println("======================");
                        System.out.println("Nyawa anda tersisa Angka : " + nyawa);
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("___|___");
                        System.out.println("HANGMAN -->" + asterisk);
                        System.out.println();
                        try {
                            while (count <= nyawa && asterisk.contains("*")) {
                                System.out.print("Masukkan jawaban [A-Z] : ");
                                String guess = stdin.readLine();
                                String regex = "^[a-zA-Z]+$";

                                if (guess.length() > 1){
                                    System.out.println("Input hanya boleh 1 huruf.");
                                } else if (!guess.matches(regex)) {
                                    System.out.println("Input hanya boleh 1 huruf.");
                                } else if (guess.length() == 1){
                                    char letter = guess.charAt(0);
                                    if (Character.isUpperCase(letter)){
                                        hang(guess);
                                    } else {
                                        System.out.println("Input huruf " + guess.toUpperCase() + " salah!");
                                    }
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
                            ArrayList<String> listScore = new ArrayList<>();
                            fileInputStream = new FileInputStream(fileName);
                            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
                            while ((message = bufferedReader.readLine()) != null){
                                String[] strings = message.split("-");
                                String[] split1 = strings[1].split("menit");
                                long menit = Long.parseLong(split1[0].trim());
                                String[] split2 = split1[1].split("detik");
                                long detik = Long.parseLong(split2[0].trim());
                                String[] split3 = split2[1].split("ms");
                                long ms = Long.parseLong(split3[0].trim());
                                long result = menit + detik + ms;
                                listScore.add(result + "-" + message);
                            }

                            Collections.sort(listScore);

                            try {
                                fileOutputStream = new FileOutputStream(fileName);
                                printStream = new PrintStream(fileOutputStream);
                                int tempInt = 0;
                                for (String temp : listScore) {
                                    String[] arrOfStr = temp.split("-", 2);
                                    printStream.println(arrOfStr[1]);
                                    System.out.println((tempInt+1) + ". " + message);
                                    tempInt++;
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
                            System.out.println("Tidak memiliki score leader board");
                        } finally {
                            if (bufferedReader != null){
                                try {
                                    bufferedReader.close();
                                    fileInputStream.close();
                                } catch (IOException e){
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                } catch (Exception io){
                    io.printStackTrace();
                }
            }
        }

        public static void hang(String guess) {
            String newasterisk = "";
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == guess.charAt(0)) {
                    newasterisk += guess.charAt(0);
                } else if (asterisk.charAt(i) != '*') {
                    newasterisk += word.charAt(i);
                } else {
                    newasterisk += "*";
                }
            }

            if (asterisk.equals(newasterisk)) {
                count++;
                hangmanImage();
            } else {
                asterisk = newasterisk;
                System.out.println("HANGMAN --> " + asterisk);
            }
            if (asterisk.equals(word)) {
                BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                ms2 = System.currentTimeMillis();
                long milliseconds = ms2 - ms1;

                long minutes = (milliseconds / 1000) / 60;
                long seconds = (milliseconds / 1000) % 60;
                long milis = milliseconds - (minutes * 60000) - (seconds * 1000);
                System.out.println("Jawaban = " + word);
                System.out.println("Anda Menang!");
                String time = minutes + "menit dan " + seconds + "detik dan "+ milis + "ms";
                System.out.format("Waktu Anda : %d menit dan %d detik dan %d ms", minutes, seconds, milis);
                System.out.println();
                System.out.print("Masukkan Nama Anda : ");

                String fileName = "score.txt";
                FileOutputStream fileOutputStream = null;
                PrintStream printStream = null;
                try {
                    String nama = stdin.readLine();
                    fileOutputStream = new FileOutputStream(fileName, true);
                    printStream = new PrintStream(fileOutputStream);
                    printStream.println(nama + " - " + time);
                } catch (Exception e){
                    System.out.print("Silahkan Masukkan Nama yang benar!");
                } finally {
                    try {
                        assert fileOutputStream != null;
                        fileOutputStream.close();
                        assert printStream != null;
                        printStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }

            }
        }

        public static void hangmanImage() {
            if (count == 1) {
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("Nyawa anda tersisa Angka : " + (nyawa - count));
                System.out.println("HANGMAN -->" + asterisk);
                System.out.println();
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
                System.out.println();
            }
            if (count == 2) {
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("Nyawa anda tersisa Angka : " + (nyawa - count));
                System.out.println("HANGMAN -->" + asterisk);
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (count == 3) {
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("Nyawa anda tersisa Angka : " + (nyawa - count));
                System.out.println("HANGMAN -->" + asterisk);
                System.out.println("   ____________");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   |");
                System.out.println("   | ");
                System.out.println("___|___");
            }
            if (count == 4) {
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("Nyawa anda tersisa Angka : " + (nyawa - count));
                System.out.println("HANGMAN -->" + asterisk);
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |           |");
                System.out.println("   |           |");
                System.out.println("   |");
                System.out.println("___|___");
            }
            if (count == 5) {
                BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("HANGMAN BUAH-BUAHAN");
                System.out.println("======================");
                System.out.println("Nyawa anda tersisa Angka : " + (nyawa - count));
                System.out.println("HANGMAN -->" + asterisk);
                System.out.println("   ____________");
                System.out.println("   |          _|_");
                System.out.println("   |         /   \\");
                System.out.println("   |        |     |");
                System.out.println("   |         \\_ _/");
                System.out.println("   |          _|_");
                System.out.println("   |         / | \\");
                System.out.println("   |          / \\ ");
                System.out.println("___|___      /   \\");
                System.out.println("Nyawa Anda Habis.");
                System.out.println("Anda Kalah!");
                System.out.print("Anda mau bermain lagi? [ya/tidak] : ");
                try {
                    mainLagi = stdin.readLine();
                    if (mainLagi.equals("ya")){
                        menu = 1;
                    } else if (mainLagi.equals("tidak")){
                        menu = 3;
                    } else {
                        System.out.println("Silahkan masukkan [ya/tidak]");
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Silahkan masukkan [ya/tidak]");
                }
            }
        }
}
