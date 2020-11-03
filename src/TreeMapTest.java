import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(new Integer(3), "Chess");
        treeMap.put(new Integer(1), "Bowling");
        treeMap.put(new Integer(4), "Chess");
        treeMap.put(new Integer(2), "Tic Tac Toe");
        treeMap.put(new Integer(3), "X O X");
        System.out.println(treeMap);
    }
}
