package src.proje3_okulYonetimi;

public class Ogrenci extends Kisi{
    private String numara;
    private String sinif;

    public Ogrenci(String adSoyad, String kimlikNo, int yas, String numara, String sinif) {
        super(adSoyad, kimlikNo, yas);
        this.numara = numara;
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return "AdSoyad=" + getAdSoyad() + ", KimlikNo=" + getKimlikNo() + ", Yas=" + getYas() + " numara=" + numara + ", sınıf=" + sinif;
    }
}
