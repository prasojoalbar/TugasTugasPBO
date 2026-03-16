public class BujurSangkar extends BangunDatar{
    double sisi;

    BujurSangkar(double sisi){
        this.sisi = sisi;
    }

    double luas(){
        return sisi * sisi;
    }

    double keliling(){
        return 4 * sisi;
    }
}