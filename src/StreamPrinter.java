import java.io.InputStream;

public class StreamPrinter {

    InputStream inputStream;

    public static void main(String[] args) {
        StreamPrinter streamPrinter = new StreamPrinter(System.in);
        streamPrinter.print();
    }

    public StreamPrinter(InputStream inputStream){
        this.inputStream = inputStream;
    }

    public void print(){
        try{
            while (true) {
                int dataNum = inputStream.read();
                if (dataNum == -1) {
                    break;
                }
                System.out.println(dataNum);
            }

        } catch (Exception e) {
            System.out.println("Couldn't read from System.in!");

        }
    }

}
