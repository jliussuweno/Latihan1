import java.io.*;

public class ReadTextFile {
    public static void main(String[] args) {
        String fileName = "data.txt";
        String message = null;
        FileInputStream fileInputStream = null;
        BufferedReader bufferedReader = null;

        try {
            fileInputStream = new FileInputStream(fileName);
            bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while ((message = bufferedReader.readLine()) != null){
                System.out.println(message);
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
                fileInputStream.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
