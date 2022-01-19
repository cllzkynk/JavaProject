package KutuphaneProject_;

public interface IKitapIslemleri {
	
	//degisken (variable) ve method body yazamiyoruz.
	//yeni obje olusturamiyoruz.
	//Abstract class lara extend edilmez.
	
	//yeni sinif olusturmak icin yazilan kurallari barindirir.
	
	void kitapEkle(Kitap kitap);
	void kitapSil(int id);
	void kitapGuncelle(int id, Kitap kitap);
	void tumKitaplar();
	
	

}
