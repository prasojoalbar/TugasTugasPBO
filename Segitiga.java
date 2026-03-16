class Segitiga extends BangunDatar{
    double alas, tinggi, sisi1, sisi2, sisi3;

    Segitiga(double alas, double tinggi, double sisi1, double sisi2, double sisi3){
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    double luas(){
        return 0.5 * alas * tinggi;
    }

    double keliling(){
        return sisi1 + sisi2 + sisi3;
    }
}