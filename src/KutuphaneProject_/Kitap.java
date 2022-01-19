package KutuphaneProject_;

public class Kitap {

	private String kitapAdi;
	private String kitapIsbnNo;
	private Yazar yazar;
	private YayinEvi yayinevi;
	private String aciklama;
	
	
	public Kitap(String kitapAdi, String kitapIsbnNo, Yazar yazar, YayinEvi yayinevi, String aciklama) {
		super();
		this.kitapAdi = kitapAdi;
		this.kitapIsbnNo = kitapIsbnNo;
		this.yazar = yazar;
		this.yayinevi = yayinevi;
		this.aciklama = aciklama;
	}


	public String getKitapAdi() {
		return kitapAdi;
	}


	public void setKitapAdi(String kitapAdi) {
		this.kitapAdi = kitapAdi;
	}


	public String getKitapIsbnNo() {
		return kitapIsbnNo;
	}


	public void setKitapIsbnNo(String kitapIsbnNo) {
		this.kitapIsbnNo = kitapIsbnNo;
	}


	public Yazar getYazar() {
		return yazar;
	}


	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}


	public YayinEvi getYayinevi() {
		return yayinevi;
	}


	public void setYayinevi(YayinEvi yayinevi) {
		this.yayinevi = yayinevi;
	}


	public String getAciklama() {
		return aciklama;
	}


	public void setAciklama(String aciklama) {
		this.aciklama = aciklama;
	}
	public void kitapBilgileri() {
		System.out.println("Kitap adi: " +getKitapAdi() +"\nKitap ISBN: " +getKitapIsbnNo()+  "\nYazar Adi: "+
	getYazar().getYazarAdi()+ "\nYayinevi Adi: " +getYayinevi().getYayineviAdi()+"\nAciklama" + getAciklama());
	}
	
	
	

}
