import java.util.List;

public class Calculator {

    private int lastResult;
    private List aList;

    public Calculator(){

    }

    public int add(int a, int b){
        return 0;
    }

    public int diff(int a, int b){
        int c = 0;
        if (a > b){
            c = a - b;
            int dummy = a + b;
            System.out.println("Hasil ditambah: " + dummy);
        } else {
            c = b -a;
        }
        this.lastResult = c;
        return c;
    }

    public int getLastResult(){
        return this.lastResult;
    }

}
