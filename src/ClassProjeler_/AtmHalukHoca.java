package ClassProjeler_;

import java.util.HashMap;
import java.util.Scanner;


public class AtmHalukHoca {

	/*
	 * ATM uygulamasi yapiniz.
	 *
	 * 1. Adim : Bankamizdaki musterilerin musteriNumarasi ve 4 haneli sifresini tutan bir HashMap olusturalim.
	 * 		     Ve bu musterileri biz ekleyelim.
	 * 			Integer, Integer
	 *
	 * 			Musteri No  -- Sifre
	 * 			12345678	   1876
	 * 			22222222	   1234
	 * 			98765432	   1453
	 * 			55554444	   2020
	 *
	 * 2. Adim : Bankamizdaki musterilerin hesaplarindaki para miktarini tutan bir tane HashMap olusturalim.
	 * 		     Ve bu miktarlari musteri numarasiyla birlikte ekleyelim
	 * 			Integer,Float
	 *
	 * 			Musteri No  -- Para
	 * 			12345678	   120.0
	 * 			22222222	   3000.0
	 * 			98765432	   7000.0
	 * 			55554444	   50.0
	 *
	 * 3. Adim : Giris ekrani olusturalim.
	 *           Musteri buradan giris yapsin.
	 * 			 Kullanici adi ve sifre isteyelim, dogru ise giris yapsin.
	 *
	 * 4. Adim : Dogru musteri numarasi ve sifre kontrol eden methodlar yazalim.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 	Hashmap listemizde varsa, dogru musteri numarasidi.
	 *
	 * 			sifreDogruMu (int no, int sifre)
	 * 				HashMap'teki sifre ile uyusuyorsa dogru sifredir.
	 *
	 * 5. Adim : Girıs yaptıktan sonra karsısına 3 tane secenek cıksın :
	 * 			 Bunları da menuGoster() methodu ile yapalım.
	 * 			 1- Para cek			// 300
	 * 			 2- Para Yukle			// 500 + 100
	 * 			 3- Toplam Paramı Gor	// 200
	 * 			 4- Cıkıs Yap
	 *
	 * 6. Adim : Cıkıs methodu olusturalim.
	 * 			 Giris yapan musteri cikis yapmak isterse, toplamPara ve girisYapanMusteriNo'yu sifirlayalim.
	 * 			 Tekrar giris ekranina yndendirelim.
	 *
	 * 6. Adim : Toplam parami gor methodu olusturalım. toplamParamiGor()
	 *
	 /* 7. Adim : 1- Para cekme methodu olusturalım
	 * 			 Hesaba giris yapan musteriye hesabındaki toplam parayı gosterelim.
	 * 			 Kullanicidan cekmek istedigi tutari ogrenelim.
	 * 			 Hesabinda yeterli para varsa, para ceksin yoksa uyarı verelim.
	 * 			 Cektigi tutarı, toplam parasından duselim ve kaydedelim.
	 *			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
	 */

	 /* 8. Adim : 1- Para Yukleme Methodu Olusturalim
	 * 			 Hesaba giris yapan musteriye hesabindaki toplam parayi gsterelim.
	 * 			 Kullanicidan yuklemek istedigi tutari ogrenelim.
	 * 			 Yukledigi tutari, toplam parasina ekleyelim ve gsterelim.
	 * 			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
	 *
	 * */

	static Scanner scan = new Scanner(System.in);
	static double bakiye=200;


	static int musteriNo = 12121212;
	static int sifrem = 1234;

	public static void main(String[] args) {

		/*
		 * ATM uygulamasi yapiniz.
		 *
		 * 1. Adim : Bankamizdaki musterilerin musteriNumarasi ve 4 haneli sifresini tutan bir HashMap olusturalim.
		 * 		     Ve bu musterileri biz ekleyelim.
		 * 			Integer, Integer
		 *
		 * 			Musteri No  -- Sifre
		 * 			12345678	   1876
		 * 			22222222	   1234
		 * 			98765432	   1453
		 * 			55554444	   2020
		 */

		HashMap<Integer, Integer> ms = new HashMap<>();

		ms.put(12345678, 1876);
		ms.put(22222222, 1234);
		ms.put(98765432, 1453);
		ms.put(55554444, 2020);

		// System.out.println(ms);

		/* 2. Adim : Bankamizdaki musterilerin hesaplarindaki para miktarini tutan bir tane HashMap olusturalim.
		 * 		     Ve bu miktarlari musteri numarasiyla birlikte ekleyelim
		 * 			Integer,Float
		 *
		 * 			Musteri No  -- Para
		 * 			12345678	   120.0
		 * 			22222222	   3000.0
		 * 			98765432	   7000.0
		 * 			55554444	   50.0

		 */
		HashMap<Integer, Float> mh = new HashMap<>();

		mh.put(12345678, 120.0f);
		mh.put(22222222, 3000.0f);
		mh.put(98765432, 3000.0f);
		mh.put(55554444, 50.0f);

		// System.out.println(mh);


		/*3. Adim : Giris ekrani olusturalim.
		 *           Musteri buradan giris yapsin.
		 * 			 Kullanici adi ve sifre isteyelim, dogru ise giris yapsin.

		 */
		 System.out.println("~~~~~~~HIB BANKA HOSGELDINIZ~~~~~~~");

		int kontrol=0;
		do {
			System.out.print("Lutfen Kullanici adini giriniz : ");
			String kullaniciAdi = scan.nextLine();
			System.out.print("Lutfen sifrenizi giriniz : ");
			int sifrem = scan.nextInt();
			scan.nextLine();


			switch (sifrem) {
				case 1876:
				case 1234:
				case 1453:
				case 2020:
					System.out.println("Sifre basari ile tamamlandi...");
					kontrol=1;
					break;
				default:
					System.out.println("Hatali tuslama yaptiniz.\nLutfen tekrar deneyiniz");
					System.out.println("**************************************************\n");
					break;
			}
		}while(kontrol==0);

		 /* 4. Adim : Dogru musteri numarasi ve sifre kontrol eden methodlar yazalim.
	 * 			 musteriNumarasiDogruMu(int no)
	 * 			 Hashmap listemizde varsa, dogru musteri numarasidi.
	 *
	 * 			sifreDogruMu (int no, int sifre)
	 * 			HashMap'teki sifre ile uyusuyorsa dogru sifredir.		  */

		musteriNumarasiDogruMu();


		/*
		 * 5. Adim : Girıs yaptıktan sonra karsısına 3 tane secenek cıksın :
		 * 			 Bunları da menuGoster() methodu ile yapalım.
		 * 			 1- Para cek			// 300
		 * 			 2- Para Yukle			// 500 + 100
		 * 			 3- Toplam Paramı Gor	// 200
		 * 			 4- Cıkıs Yap    */

		menuGoster();

		//  * 6. Adim : Toplam parami gor methodu olusturalım. toplamParamiGor()





		/* 7. Adim : 1- Para cekme methodu olusturalım
		 * 			 Hesaba giris yapan musteriye hesabındaki toplam parayı gosterelim.
		 * 			 Kullanicidan cekmek istedigi tutari ogrenelim.
		 * 			 Hesabinda yeterli para varsa, para ceksin yoksa uyarı verelim.
		 * 			 Cektigi tutarı, toplam parasından duselim ve kaydedelim.
		 *			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
		 */



		/* 8. Adim : 1- Para Yukleme Methodu Olusturalim
		 * 			 Hesaba giris yapan musteriye hesabindaki toplam parayi gsterelim.
		 * 			 Kullanicidan yuklemek istedigi tutari ogrenelim.
		 * 			 Yukledigi tutari, toplam parasina ekleyelim ve gsterelim.
		 * 			 Baska islem yapmak isteyip istemedigini soralim, isterse yaptiralim, yoksa cikis islemi gerceklestirelim.
		 *
		 * */



		}

	public static void paraYukleme() {
		System.out.println("**************************************************\n");
		//toplamParamiGor();
		System.out.println("Lutfen yuklemek istediginiz tutari giriniz : ");
		int yuklenecekMiktar= scan.nextInt();
		bakiye+=yuklenecekMiktar;
		System.out.println("Bakiyeniz : " + bakiye);

	}

	// 7.adim cozumu
	public static void paraCekme() {
		System.out.println("**************************************************\n");
		//toplamParamiGor();
		System.out.println("Lutfen cekmek istediginiz tutari giriniz : ");
		int cekilecekMiktar= scan.nextInt();
		bakiye-=cekilecekMiktar;
		System.out.println("Bakiyeniz : " + bakiye);
		if(bakiye>=cekilecekMiktar){
			System.out.println("Islem basariyla gerceklestirildi...");
		}else if (bakiye<cekilecekMiktar){
			System.out.println("Yetersiz Bakiye :(");
		}
		menuGoster();


	}

	// 6.adim cozumu
	public static void toplamParamiGor() {
		System.out.println("**************************************************\n");
		System.out.println("Bakiyeniz : " + bakiye);
	}

	// 5. adim cozumu
	public static void menuGoster() {
		System.out.println("**************************************************\n");

		int kontrol = 0;
		do {
			System.out.println("Lutfen islem yapmak istediginiz secenegi tuslayiniz\n1-Para Cekme" +
					"\n2-Para Yukleme\n3-Bakiye\n4-Cikis");

			int islem = scan.nextInt();

			switch (islem) {
				case 1:
					paraCekme();
					break;
				case 2:
					paraYukleme();
					break;
				case 3:
					toplamParamiGor();
					break;
				case 4:
					System.out.println("Cikis islemi basari ile tamamlandi...");
					kontrol=1;
					break;
				default:
					System.out.println("Hatali tuslama yaptiniz.\nLutfen tekrar deneyiniz");
					System.out.println("**************************************************\n");
					break;
			}
		} while (kontrol == 0);
	}
	// 4. adim cozumu
	public static void musteriNumarasiDogruMu() {
		HashMap<Integer, Integer> ms1 = new HashMap<>();

		ms1.put(12345678, 1876);
		ms1.put(22222222, 1234);
		ms1.put(98765432, 1453);
		ms1.put(55554444, 2020);

		int kontrol=0;
		do {
			System.out.println("**************************************************");
			System.out.print("Lutfen musteri numarasini giriniz : ");
			int musteriNo = scan.nextInt();
			scan.nextLine();

			switch (musteriNo) {
				case 12345678:
				case 22222222:
				case 98765432:
				case 55554444:
					System.out.println("Musteri numarasini basari ile girdiniz...");
					kontrol=1;
					break;
				default:
					System.out.println("Hatali tuslama yaptiniz.\nLutfen tekrar deneyiniz");
					System.out.println("**************************************************\n");
					break;
			}
		}while(kontrol==0);


		}





	}



