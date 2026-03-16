class PersegiPanjang extends BangunDatar{
    double panjang, lebar;

    PersegiPanjang(double panjang, double lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    double luas(){
        return panjang * lebar;
    }

    double keliling(){
        return 2 * (panjang + lebar);
    }
}