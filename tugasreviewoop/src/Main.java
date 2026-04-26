import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Rekening> daftarRekening = new ArrayList<>(); // 

        // Menambahkan berbagai jenis rekening [cite: 30, 42]
        daftarRekening.add(new Tabungan("Andi", "T101", 10000000, 5));
        daftarRekening.add(new Giro("Budi", "G201", 5000000, 2000000));
        daftarRekening.add(new Deposito("Citra", "D301", 10000000, 12, 0.06));

        // Simulasi transaksi
        daftarRekening.get(0).setor(500000, true); // Overloading transfer [andi]
        ((Tabungan) daftarRekening.get(0)).hitungBunga(6); // Simulasi bunga tabungan [andi]
        
        // Simulasi penarikan deposito sebelum jatuh tempo
        daftarRekening.get(2).tarik(1000000); // Kena denda [citra]

        // Menampilkan semua rekening menggunakan perulangan [cite: 45]
        System.out.println("\n--- DAFTAR SEMUA REKENING ---");
        Rekening tertinggi = daftarRekening.get(0);
        Rekening terendah = daftarRekening.get(0);

        for (Rekening r : daftarRekening) {
            r.tampilkanInfo();
            System.out.println("--------------------");
            
            if (r.saldo > tertinggi.saldo) tertinggi = r;
            if (r.saldo < terendah.saldo) terendah = r;
        }

        // Statistik Saldo [cite: 45]
        System.out.println("Saldo Tertinggi: " + tertinggi.namaPemilik + " (Rp " + tertinggi.saldo + ")");
        System.out.println("Saldo Terendah: " + terendah.namaPemilik + " (Rp " + terendah.saldo + ")");
    }
}