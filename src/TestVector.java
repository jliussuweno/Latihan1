import java.util.Vector;

public class TestVector {

    public static void main(String[] args) {
        otherMethod();
    }

    static void aMethod1(Vector v){
        v.add("DEF");
        System.out.println("Vector size in aMethod1: " + v.size());
    }

    static void aMethod2(Vector v){
        v = new Vector();
        v.add("1");
        v.add("2");
        v.add("3");
        System.out.println("Vector size in aMethod2: " + v.size());
    }

    private static void otherMethod(){
        Vector aVector = new Vector();
        aVector.add("ABC");
        System.out.println("Vector size before aMethod1:" + aVector.size());
        aMethod1(aVector);
        System.out.println("Vector size after aMethod1:" + aVector.size());
        aMethod2(aVector);
        System.out.println("Vector size before aMethod2:" + aVector.size());
    }
}
