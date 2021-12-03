package proje1_yesilMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ye�ilMarkett {
	
	public static List <String> urunler = new ArrayList<>();  // Global
	public static List <Double> fiyatlar = new ArrayList<>();
	
	public static List <String> sepeturunler = new ArrayList<>();
	public static List <Double> sepetKg = new ArrayList<>();
	public static List <Double> sepetFiyatlar = new ArrayList<>();
	
		
	public static void main(String[] args) {
		
		/* Yeşil Market aliş-veriş programi.
		 * 
		 * 1. Adim: urunler ve fiyatlari içeren listeleri oluşturunuz.
		 * 			No 	   urun 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL 
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 uzum      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL
					
		 * 2. Adim: Kullanicinin urun nosuna gore listeden urun seçmesini isteyiniz.
		 * 3. Adim: Kaç kg satin almak istediğini sorunuz.
		 * 4. Adim: Alinacak bu urunu sepete ekleyiniz ve Sepeti yazdiriniz.
		 * 5. Başka bir urun alip almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden urun seçme kismina yonlendiriniz.
		 * 7. Eğer bitirmek istiyorsa odeme kismina geçiniz ve odem sonrasinda programi bitirinzi.
		 */
		Scanner scan = new Scanner(System.in);
		
		urunler.addAll(Arrays.asList("Domates","Patates","Biber","Soğan","Havuç",
				                     "Elma","Muz","Çilek","Kavun","uzum","Limon"));
		
		
		fiyatlar.addAll(Arrays.asList(2.1, 3.2, 1.5, 2.3, 3.1, 1.2, 1.9, 6.1, 4.3, 2.7, 0.5));	
		String devam ;
		double toplamFiyat = 0.0;
		
		do {
			urunListele();
			System.out.println("urununuzu numaraya gore seçiniz:");
			int urunNo = scan.nextInt();
			System.out.println("Ağirlik giriniz:");
			double kg = scan.nextDouble();
			sepeteEkle(urunNo, kg);
			toplamFiyat = Math.round(sepeteYazdir());
			System.out.println("Aliş verişe deam etmek istermisiniz:");
			devam = scan.next();
		}while(devam.equalsIgnoreCase("e"));
		
		odeme(toplamFiyat);
		
	scan.close();
	}
	
	public static void urunListele() {
		System.out.println("No\t urunler \tFiyatlar");
		System.out.println("===\t ======== \t========");
		
		for (int i = 0; i<urunler.size(); i++) {
			System.out.println(" "+ i + "\t" + urunler.get(i) + "\t \t   " + fiyatlar.get(i));
		}
	}
	
	public static void sepeteEkle(int urunNo, double kg) {
		sepeturunler.add(urunler.get(urunNo));
		sepetKg.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo) * kg);
	}
	
	public static double sepeteYazdir() {
		
		double fiyatToplami = 0.0;
		double kgToplami = 0.0;
		
		System.out.println("urun adi \tKG \tFiyati");
		System.out.println("=================================");
		for(int i=0 ; i < sepeturunler.size() ; i++ ) {
			System.out.println(sepeturunler.get(i) + "\t \t" + sepetKg.get(i) + "\t" + sepetFiyatlar.get(i));
			fiyatToplami +=  sepetFiyatlar.get(i);
			kgToplami += sepetKg.get(i);
		}
		
		System.out.println("=================================");
		System.out.println("\t TOPLAM:" + kgToplami + "\t" + fiyatToplami);
		
		return fiyatToplami;
	}
	
	public static void odeme(double toplamFiyat){
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("***********************************");
		System.out.println("************* ÖDEME ***************");
		System.out.println("ÖDENECEK TOPLAM FİYAT:" + toplamFiyat);
//		System.out.printf("ÖDENECEK TOPLAM FİYAT: %.2f", toplamFiyat);
		double nakit = 0.0;
		do {
			System.out.print("Lutfen Nakit Giriniz:");
			nakit += scan.nextDouble();
			if(nakit < toplamFiyat) {
				System.out.println("Girilen Rakam yetersiz.");
				System.out.println((toplamFiyat - nakit) + " TL daha yatirmaniz gerekmektedir.");
			}
		}while(nakit < toplamFiyat);
		
		double paraustu = nakit - toplamFiyat;
		if (paraustu > 0) {
			System.out.println("PARA uSTu :" + paraustu);
		}
		
		System.out.println("YİNE BEKLERİZ");
		
	scan.close();
	}
	
	
	
	
	
	

}
