public class Rectangle implements Flipable{
    char atasKiri = 'A';
    char atasKanan = 'B';
    char bawahKiri = 'C';
    char bawahKanan = 'D';
    char temp = ' ';

    @Override
    public void flipAtasBawah() {
        System.out.println("Rectangle Sebelum flipAtasBawah");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);

        temp =atasKiri;
        atasKiri = bawahKiri;
        bawahKiri = temp;

        temp = atasKanan;
        atasKanan = bawahKanan;
        bawahKanan = temp;

        System.out.println("Rectangle Setelah flipAtasBawah");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);
        System.out.println("-----------------------------");
    }

    @Override
    public void flipKiriKanan() {
        System.out.println("Rectangle Sebelum flipKiriKanan");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);

        temp = atasKiri;
        atasKiri = atasKanan;
        atasKanan = temp;

        temp = bawahKanan;
        bawahKanan = bawahKiri;
        bawahKiri = temp;

        System.out.println("Rectangle Setelah flipKiriKanan");
        System.out.println(atasKiri + " " +atasKanan);
        System.out.println(bawahKiri + " " +bawahKanan);
        System.out.println("-----------------------------");
    }
}
