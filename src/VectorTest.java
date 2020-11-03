import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<String>();
        vector.add("Zebra");
        vector.add("Gajah");
        vector.add(0,"Domba");
        vector.add("Macan");
        vector.add("Zebra");

        System.out.println(vector);
        String name = (String) vector.get(2);
        System.out.println(name);
        System.out.println("Size Vector = " + vector.size());
        vector.remove(3);
        System.out.println("\n Remove 1 data di Vector");
        System.out.println("Size Vector = "+ vector.size());
        System.out.println(vector + "\n");
        for (int i = 0; i < vector.size(); i++){
            System.out.println("Vector " + i + " : " + vector.get(i));
        }

    }
}
