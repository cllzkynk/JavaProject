package SatisStokSistemi;

public class Urun {
    String urunAdi;
    double fiyat;
    int stokMiktari;

    public Urun(){
        
    }
    public Urun(String urunAdi, double fiyat, int stokMiktari) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.stokMiktari = stokMiktari;
    }
}
