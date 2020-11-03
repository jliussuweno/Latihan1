import java.util.Hashtable;

public class HashtableTest {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("Game1", "Dota");
        hashtable.put("Game2", "Chess");
        hashtable.put("Game3", "Football");
        hashtable.put("Game4", "Bowling");
        hashtable.put("Game5", "Chess");
        hashtable.put(77, "Chess");
        System.out.println(hashtable);
        hashtable.put("Game4", "Ini empat");
        String empat = (String)  hashtable.get("Game4");
        System.out.println(empat);
        System.out.println(hashtable);

    }
}
