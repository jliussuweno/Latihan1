import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadKeyboard {

    public static void main(String[] args) {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String name;
        int score = 0;
        System.out.println("Please enter your name:");
        try {
            name = stdin.readLine();
            System.out.println("Hi, " + name + "!");
            System.out.println("Please enter your exam score");
            try {
                score = Integer.parseInt(stdin.readLine());
                System.out.println("If your exam score is divided 2 = " + (score / 2));
            } catch (NumberFormatException nfe) {
                System.out.println("You must be input number value!");
                System.out.println("System Terminate");
            } catch (Exception e){
                e.printStackTrace();
            }
        } catch (IOException io){
            io.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
