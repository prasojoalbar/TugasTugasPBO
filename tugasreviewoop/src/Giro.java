public class Giro extends Rekening {
    private double limitPenarikan; // [cite: 28]

    public Giro(String nama, String nomor, double saldo, double limit) {
        super(nama, nomor, saldo);
        this.limitPenarikan = limit;
    }

    @Override
    public void tarik(double jumlah) { // [cite: 29]
        if (jumlah <= saldo + limitPenarikan) {
            this.saldo -= jumlah;
            System.out.println("Tarik Giro berhasil: Rp " + jumlah);
        } else {
            System.out.println("Penarikan melebihi limit giro!");
        }
    }
}