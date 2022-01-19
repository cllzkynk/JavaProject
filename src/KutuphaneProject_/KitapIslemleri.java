package KutuphaneProject_;

import java.util.ArrayList;

public class KitapIslemleri implements IKitapIslemleri {
	ArrayList<Kitap> kitaplar =new ArrayList<Kitap>();


	@Override
	public void kitapEkle(Kitap kitap) {
	kitaplar.add(kitap);


	}

	@Override
	public void kitapSil(int id) {
		kitaplar.remove(id);

	}

	@Override
	public void kitapGuncelle(int id, Kitap kitap) {
		kitaplar.set(id, kitap);


		
	}

	@Override
	public void tumKitaplar() {
		if(kitaplar.isEmpty()) {
			System.out.println("Suan herhangi bir kitap kayitli degil.");
		}
		else {
			for (Kitap kitap : kitaplar) {
				kitap.kitapBilgileri();
				
			}
		}
	}

	

}
