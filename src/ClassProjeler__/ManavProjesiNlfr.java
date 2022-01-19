package ClassProjeler__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class ManavProjesiNlfr {
	/* Basrili Market alış-veriş programı.
	*
	* 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.

	* 			No 	   Ürün 		  Fiyat
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
				09	 Üzüm      	 	 2.70 TL
				10	 Limon     	 	 0.50 TL

	* 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
	* 3. Adım: Kaç kg satın almak istediğini sorunuz.
	* 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
	* 5. Başka bir ürün alıp almak istemediğini sorunuz.
	* 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
	* 7. Eğer bitirmek istiyorsa ödeme kısmına geçiniz ve ödem sonrasında programı bitirinzi.
	*/



	// 1. adimda urunler listesi yapmaliyim..
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<String> urunler = new ArrayList();

	// 2. adimda ise fiyat listesi hazirlamaliyim..
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Double> fiyatlar = new ArrayList();

	// 12. adim
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<String> sepettekiUrunler = new ArrayList();
	// 13. adim
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Double> sepettekiFiyat = new ArrayList();
	// 14. adim
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static List<Double> sepettekiKilo = new ArrayList();

	// 3. adimda ise main olusturuyoruz...
	public static void main(String[] args) {

		// 4. adimda ise urunleri ve fiyalari listeliyorum...
		urunler.addAll(Arrays.asList("Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek", "Kavun",
				"Uzum", "Limon"));
		fiyatlar.addAll(Arrays.asList(2.10, 3.20, 1.50, 2.30, 3.10, 1.20, 1.90, 6.10, 4.30, 2.70, 0.50));

		// 8. adimda Scanner olusturuyoruz...
		Scanner scan = new Scanner(System.in);

		// 10. adimda
		int urunNo;
		double kg = 0;
		// 20.adim
		String devam;
		// 28. adimda double toplam diye bir degiken olusturdum...
		double toplam;

		// 22. adimda ise do while yapiyoruz...

		do {
			// 5. adimda ise urunleriListele metodu olusturuyoruz..
			urunleriListele();

			// 9. adimda ise
			System.out.print("Almak istediginiz urun numarasini giriniz : ");
			urunNo = scan.nextInt();
			System.out.print("Kac kg almak istiyorsunuz : ");
			kg = scan.nextDouble();

			// 11. adim da ise aldigim urunleri sepeteEkle Methodu ile sepete aliyorum..
			sepeteEkle(urunNo, kg); // parametreli method creat etmeliyim...

			// 16. adimda sepetiYazdir methodu olusturduk
			toplam = sepetiYazdir(); // 27. adimda sepeti yazdiri 2. islem olarak toplama esitledim.
			// 19. adimda ise
			System.out.println("Devam etmek istiyor musunuz(E/H)");
			// 21. adim
			devam = scan.next();
		} while (devam.equalsIgnoreCase("E"));

		// 23. adimda ise aldigim urunlerin toplam odemesini yapmam lazim
		odemeYap(toplam);

		scan.close();
	}

	public static void odemeYap(double toplam) {
		// 29. adimda odemeYap metodunun icini duzenliyorum...
		Scanner scan = new Scanner(System.in);
		double miktar = 0;
		System.out.println("--------------------------------------------");
		System.out.println("odemeniz gereken miktar : " + toplam);
		System.out.println("--------------------------------------------");

		// 31. adimda do while yapiyoruz...
		do {
			// 30. adimda if olusturuyorum...
			System.out.print("Ne kadar paraniz var : ");
			miktar += scan.nextDouble();
			if (miktar < toplam) {
				System.out.println("Paraniz yetersiz, ekleme yapin");
				System.out.println("Ekleme yapacaginiz miktar : " + (toplam - miktar));
			}
		} while (miktar <= toplam);

		// 31. adim
		System.out.println("--------------------------------------------");
		System.out.println("Su ana kadar " + miktar + " kadar odeme yaptiniz");
		System.out.println("Toplam borcunuz " + toplam);
		System.out.println("--------------------------------------------");

		// 32. adim
		System.out.println("Para Ustunuz : " + (miktar - toplam));
		System.out.println("Bizi tercih ettiginiz icin tesekkurler");

		scan.close();
	}

	public static double sepetiYazdir() {
		// 25. adim da ise septtekiToplam isminde double bir degisken olusturuyorum..
		double sepettekiToplam = 0;

		// 18. adim kozmetik ve baslik
		System.out.println("NO\tURUNLER\tFIYATLAR");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// 17. adim da for yapiyoruz...
		for (int i = 0; i < sepettekiUrunler.size(); i++) {
			System.out.println(sepettekiUrunler.get(i) + "\t" + sepettekiKilo.get(i) + "\t" + sepettekiFiyat.get(i));

			// 24. adimda sepettekiToplam olsuturuyoruz...
			sepettekiToplam += sepettekiFiyat.get(i);
		}

		// 33. adimda ise 
		System.out.println("-----------------------------------------------");
		System.out.println("Su ana kadar yaptiginiz aliverisin tutari : " + sepettekiToplam);
		// 26. adimda return yapiyoruz..
		return sepettekiToplam;
	}

	public static void sepeteEkle(int urunNo, double kg) {

		// 15. adimda bu 3 eklemeyi yaptik...
		sepettekiUrunler.add(urunler.get(urunNo));
		sepettekiKilo.add(kg);
		sepettekiFiyat.add(fiyatlar.get(urunNo) * kg);

	}

	private static void urunleriListele() {

		// 7. adimda ise kozmetik ve baslik hazirliyoruz....
		System.out.println("NO\tURUNLER\t     FIYATLAR");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// 6. adimda ise for kullanip runtime de gormek istiyorum
		for (int i = 0; i < urunler.size(); i++) { // ArrayList te uzunluk size ile belirtilir...

			System.out.println(i + "\t" + urunler.get(i) + "\t\t" + fiyatlar.get(i));
			// i= 0 --> 0. indexten baslar
			// urunler.get--> domatesten baslar
			// fiyatlar--> domatesin fiyatindan baslar
		}

	}

}