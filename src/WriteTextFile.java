import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class WriteTextFile {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String message = "Welcome to the Java World!";
        FileOutputStream fileOutputStream = null;
        PrintStream printStream = null;
        try {
            fileOutputStream = new FileOutputStream(fileName);
            printStream = new PrintStream(fileOutputStream);

            for (int i=0; i < 100; i++){
                printStream.println(message + " " +(i+1));
            }
            System.out.println("Write to the file success");
        } catch (IOException io){
            io.printStackTrace();
        } finally {
            try {
                printStream.close();
                fileOutputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
