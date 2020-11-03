public class OverValueException extends Exception {
    private int value;

    public OverValueException(int val) {
        this.value = val;
    }
    public int getValue(){
        return  this.value;
    }
}
