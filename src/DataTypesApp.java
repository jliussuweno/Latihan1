public class DataTypesApp {
    public static void show(int a, long b, float c, double d, char e) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println();
    }

    public static void main(String[] args){
        int anInt = 410;
        long aLong = anInt;
        float aFloat = 500;
        double aDouble = 800;
        char aChar = 'a';
        show(anInt, aLong, aFloat, aDouble, aChar);

        anInt = 5/3;
        aLong = 100 / 30;
        aFloat = 3.5f;
        aDouble = 10.5;
        aChar = '\u0076';
        show(anInt,aLong, aFloat, aDouble, aChar);
    }
}
