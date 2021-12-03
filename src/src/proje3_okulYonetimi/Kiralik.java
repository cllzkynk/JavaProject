package src.proje3_okulYonetimi;

public class Kiralik extends Kisi {
    private String bolum;
    private String sicilNo;

    public Kiralik(String adSoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adSoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "AdSoyad=" + getAdSoyad() + ", KimlikNo=" + getKimlikNo() + ", "
                + ", Yaş=" + getYas() + ", bolum=" + bolum + ", sicilNo=" + sicilNo;
    }
}
