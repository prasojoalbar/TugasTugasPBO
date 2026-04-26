public class Rekening {
    protected String namaPemilik; // [cite: 12]
    protected String nomorRekening; // [cite: 13]
    protected double saldo; // [cite: 14]

    public Rekening(String nama, String nomor, double saldoAwal) {
        this.namaPemilik = nama;
        this.nomorRekening = nomor;
        this.saldo = saldoAwal;
    }

    // Overloading Versi 1: Setor tunai biasa [cite: 33, 34]
    public void setor(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Setor tunai berhasil: Rp " + jumlah);
    }

    // Overloading Versi 2: Setor via transfer dengan biaya admin [cite: 35, 36]
    public void setor(double jumlah, boolean transfer) {
        if (transfer) {
            double biayaAdmin = 2500;
            this.saldo += (jumlah - biayaAdmin);
            System.out.println("Setor via transfer berhasil. Potongan admin: Rp " + biayaAdmin);
        } else {
            setor(jumlah);
        }
    }

    // Method tarik dasar [cite: 17]
    public void tarik(double jumlah) {
        if (jumlah <= saldo) {
            this.saldo -= jumlah;
            System.out.println("Tarik tunai berhasil: Rp " + jumlah);
        } else {
            System.out.println("Saldo tidak mencukupi!");
        }
    }

    public void tampilkanInfo() { // [cite: 18]
        System.out.println("Pemilik: " + namaPemilik);
        System.out.println("No. Rekening: " + nomorRekening);
        System.out.printf("Saldo: Rp %,.2f%n", saldo);
    }
}