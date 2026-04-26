public class Tabungan extends Rekening {
    private double bungaTahunan; // dalam persen [cite: 22]

    public Tabungan(String nama, String nomor, double saldo, double bunga) {
        super(nama, nomor, saldo);
        this.bungaTahunan = bunga;
    }

    // Rumus bunga: (bungaTahunan / 12) * saldo * bulan [cite: 25, 26]
    public void hitungBunga(int bulan) {
        double bunga = (bungaTahunan / 100 / 12) * saldo * bulan;
        this.saldo += bunga;
        System.out.println("Bunga ditambahkan: Rp " + bunga);
    }

    @Override
    public void tampilkanInfo() { // [cite: 23, 24]
        super.tampilkanInfo();
        System.out.println("Bunga Tahunan: " + bungaTahunan + "%");
    }
}