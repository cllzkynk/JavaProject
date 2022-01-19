package KutuphaneProject_;

public class YayinEvi {
	private String yayineviAdi;
	private String yayineviAdresi;
	
	
	public YayinEvi(String yayineviAdi, String yayineviAdresi) {
		super();
		this.yayineviAdi = yayineviAdi;
		this.yayineviAdresi = yayineviAdresi;
	}


	public String getYayineviAdi() {
		return yayineviAdi;
	}


	public void setYayineviAdi(String yayineviAdi) {
		this.yayineviAdi = yayineviAdi;
	}


	public String getYayineviAdresi() {
		return yayineviAdresi;
	}


	public void setYayineviAdresi(String yayineviAdresi) {
		this.yayineviAdresi = yayineviAdresi;
	}
	public void yayineviBilgileri() {
		System.out.println("Yayinevi Adi: " + getYayineviAdi() +"\nYayinevi Adresi" + getYayineviAdresi());
	}
	

	

}
