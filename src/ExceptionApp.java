public class ExceptionApp {
    private static void testValue(int a) throws UnderValueException,
            OverValueException{
        if (a > 1000){
            throw new OverValueException(a);
        }
        if (a < 100){
            throw new UnderValueException(a);
        }
    }

    public static void main(String[] args){
        try {
            int a = Integer.parseInt(args[0]);
            testValue(a);
        } catch (UnderValueException ex){
            System.out.println("Under value: " + ex.getValue());
        } catch (OverValueException ex){
            System.out.println("Over Value: " + ex.getValue());
        } finally {
            System.out.println("Finally...");
        }
    }
}
