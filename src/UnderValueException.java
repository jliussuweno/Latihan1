public class UnderValueException extends Exception{
    private int value;

    public UnderValueException(int val){
        this.value = val;
    }

    public int getValue() {
        return this.value;
    }
}
