import java.util.TreeMap;

public class RomanConverter {
    private final static TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

    static {
        treeMap.put(1000, "M");
        treeMap.put(900, "CM");
        treeMap.put(500, "D");
        treeMap.put(400, "CD");
        treeMap.put(100, "C");
        treeMap.put(90, "XC");
        treeMap.put(50, "L");
        treeMap.put(40, "XL");
        treeMap.put(10, "X");
        treeMap.put(9, "IX");
        treeMap.put(5, "V");
        treeMap.put(4, "IV");
        treeMap.put(1, "I");
    }

    public static void main(String[] args){
        int tempNum = 0;
        try {
            tempNum = Integer.parseInt(args[0]);
            if (tempNum > 0 && tempNum <=3000){
                System.out.println(toRoman(tempNum));
            } else {
                System.out.println("Masukkan Angka dari 1 - 3000.");
            }
        } catch (NumberFormatException nfe){
            System.out.println("Inputan harus angka");
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Inputan tidak valid");
        }
    }

    public static String toRoman(int number) {
        int sisa =  treeMap.floorKey(number);
        if ( number == sisa ) {
            return treeMap.get(number);
        }
        return treeMap.get(sisa) + toRoman(number-sisa);
    }
}
