public class main {
    public static void main(String[] args) {

        BujurSangkar bs = new BujurSangkar(4);
        PersegiPanjang pp = new PersegiPanjang(6, 3);
        Segitiga sg = new Segitiga(4, 5, 3, 4, 5);

        System.out.println("Bujur Sangkar");
        System.out.println("Luas: " + bs.luas());
        System.out.println("Keliling: " + bs.keliling());

        System.out.println("\nPersegi Panjang");
        System.out.println("Luas: " + pp.luas());
        System.out.println("Keliling: " + pp.keliling());

        System.out.println("\nSegitiga");
        System.out.println("Luas: " + sg.luas());
        System.out.println("Keliling: " + sg.keliling());
    }
}