import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("Game1", "Dota");
        hashMap.put("Game2", "Chess");
        hashMap.put(null, "Card");
        hashMap.put("Game3", "Football");
        hashMap.put("Game4", "Bowling");
        hashMap.put("Game5", "Chess");
        hashMap.put(null, "VideoGame");
        System.out.println(hashMap);


    }
}
