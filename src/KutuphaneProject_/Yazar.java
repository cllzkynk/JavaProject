package KutuphaneProject_;

public class Yazar {
	private String yazarAdi;
	private int yazarYasi;
	private String yazarMemleketi;
	
	

	public Yazar(String yazarAdi, int yazarYasi, String yazarMemleketi) {
		super();
		this.yazarAdi = yazarAdi;
		this.yazarYasi = yazarYasi;
		this.yazarMemleketi = yazarMemleketi;
	}



	public String getYazarAdi() {
		return yazarAdi;
	}



	public void setYazarAdi(String yazarAdi) {
		this.yazarAdi = yazarAdi;
	}



	public int getYazarYasi() {
		return yazarYasi;
	}



	public void setYazarYasi(int yazarYasi) {
		this.yazarYasi = yazarYasi;
	}



	public String getYazarMemleketi() {
		return yazarMemleketi;
	}



	public void setYazarMemleketi(String yazarMemleketi) {
		this.yazarMemleketi = yazarMemleketi;
	}
	
	public void yazarBilgileri() {
		System.out.println("Adi: " +getYazarAdi() + "\nYazarin Yasi: " + getYazarYasi()+"\nYazarin Memleketi: " 
	+ getYazarMemleketi());
	}

}
