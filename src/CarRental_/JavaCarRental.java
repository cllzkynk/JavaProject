package CarRental_;



public class JavaCarRental {
	String  marka;
	String model;
	int yil;
	int gunlukFiyat;
	public JavaCarRental(String marka, String model, int yil, int gunlukFiyat) {
		this.marka = marka;
		this.model = model;
		this.yil = yil;
		this.gunlukFiyat = gunlukFiyat;

		System.out.println("----------------------------\n");
		System.out.println("Eklenen arac bilgileri-->");
		System.out.println("----------------------------\n");
		System.out.println("Aracin markasi --> "+this.marka+"\nAracin modeli --> "+this.model+"\nAracin uretim yili --> "+this.yil+"\nAracin gunluk fiyati --> $"+this.gunlukFiyat);

}
	public JavaCarRental() {
		
	}
	
	
	

	
	
	


	

	

	
	
	

}
