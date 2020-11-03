public class StringApp {
    public static void main(String[] args){
        String angkaStr = generateAngka(50000);
        System.out.println(angkaStr);
    }

    private static String generateAngka(int maks){
        StringBuffer sb = new StringBuffer();
        for (int idx = 1; idx <= maks; idx++){
            sb.append("Angka").append(idx).append("\n");
        }
        return sb.toString();
    }
}
