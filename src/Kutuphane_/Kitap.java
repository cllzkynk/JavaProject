package Kutuphane_;

public class Kitap {
   public Kitap(){

   }

    public Kitap(String kitapIsmi, String yazar, String yayinYili,double kitapFiyat) {

        this.kitapNo=kitapNo;
        this.kitapIsmi=kitapIsmi;
        this.yazar=yazar;
        this.yayinyili=yayinYili;
        this.fiyat=kitapFiyat;

    }
    private int kitapNo;
    private String kitapIsmi;
    private String yazar;
    private String yayinyili;
    private double fiyat;


    public String getkitapIsmi() {
        return kitapIsmi;
    }
    public void setkitapIsmi(String kitapIsmi ) {
        this.kitapIsmi = kitapIsmi;
    }
    public String getyazar() {
        return yazar;
    }
    public void setyazar(String yazar) {
        this.yazar = yazar;
    }
    public String getyayinyili() {
        return yayinyili;
    }
    public void setyayinyili(String yayinyili) {
        this.yayinyili = yayinyili;
    }
    public double getfiyat() {
        return fiyat;
    }
    public void setfiyat(double fiyat) {
        this.fiyat = fiyat;
    }
    public int getkitapNo() {
        return kitapNo;
    }
    public void setkitapNo(int kitapNo) {
        this.kitapNo = kitapNo;
    }
    @Override
    public String toString() {
        return "\nKitap Ismi: " + kitapIsmi + "\nYazar: " + yazar + "\nYayin Yili: "
                + yayinyili + "\nFiyat=" + fiyat;
    }}