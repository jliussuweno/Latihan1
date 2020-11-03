public class Triangle implements Flipable {
    char atasKiri = 'A';
    char atasKanan = ' ';
    char bawahKiri = 'B';
    char bawahKanan = 'C';
    char temp = ' ';

    @Override
    public void flipAtasBawah() {
        System.out.println("Triangle Sebelum flipAtasBawah");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);

        temp =atasKiri;
        atasKiri = bawahKiri;
        bawahKiri = temp;

        temp = atasKanan;
        atasKanan = bawahKanan;
        bawahKanan = temp;

        System.out.println("Tiangle Setelah flipAtasBawah");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);
        System.out.println("-----------------------------");
    }

    @Override
    public void flipKiriKanan() {
        System.out.println("Triangle Sebelum flipKiriKanan");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);

        temp = atasKiri;
        atasKiri = atasKanan;
        atasKanan = temp;

        temp = bawahKanan;
        bawahKanan = bawahKiri;
        bawahKiri = temp;

        System.out.println("Tiangle Setelah flipKiriKanan");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);
        System.out.println("-----------------------------");

    }
}
