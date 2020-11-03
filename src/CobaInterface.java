public class CobaInterface {
    public static void main(String[] args) {
        Flipable flipable = new Rectangle();
        flipable.flipAtasBawah();
        flipable.flipKiriKanan();
        System.out.println("\n\n\n");

        Flipable flipable1 = new Triangle();
        flipable1.flipAtasBawah();
        flipable1.flipKiriKanan();
    }
}
