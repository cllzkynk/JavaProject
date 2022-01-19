package OgrenciIsleri_;

/*
 * OgrenciOlusturma adinda bir class olusturun Ogrencinin numarasi, adi, soyadi
 * ve ortalamasi degiskenlerini private access modifier kullanarak olusturun
 * getter ve setter methodlari olusturun default constructor ve tum degiskenleri
 * iceren parametleri constructor olusturun
 *
 *
 * OgrenciIsleri adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
 * ogrenci silme ve cikis methodlari olusturun bu methodlari switch case ile
 * cagirin
 *
 *
 *
 *
 */
public class OgrenciOlusturma {

	public OgrenciOlusturma() {

	}

	public OgrenciOlusturma(int ogrNum, String ogrAd, String ogrSoyad, double ogrOrtalama) {
		this.ogrNum = ogrNum;
		this.ogrAd = ogrAd;
		this.ogrSoyad = ogrSoyad;
		this.ogrOrtalama = ogrOrtalama;
	}

	private int ogrNum;
	private String ogrAd;
	private String ogrSoyad;
	private double ogrOrtalama;

	public int getOgrNum() {
		return ogrNum;
	}

	public void setOgrNum(int ogrNum) {
		this.ogrNum = ogrNum;
	}

	public String getOgrAd() {
		return ogrAd;
	}

	public void setOgrAd(String ogrAd) {
		this.ogrAd = ogrAd;
	}

	public String getOgrSoyad() {
		return ogrSoyad;
	}

	public void setOgrSoyad(String ogrSoyad) {
		this.ogrSoyad = ogrSoyad;
	}

	public double getOgrOrtalama() {
		return ogrOrtalama;
	}

	public void setOgrOrtalama(double ogrOrtalama) {
		this.ogrOrtalama = ogrOrtalama;
	}

}
