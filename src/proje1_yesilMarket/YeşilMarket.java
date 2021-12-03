package proje1_yesilMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YeþilMarket {

	public static List<String> urunler = new ArrayList<>(); // Global
	public static List<Double> fiyatlar = new ArrayList<>();

	public static List<String> sepeturunler = new ArrayList<>();
	public static List<Double> sepetKg = new ArrayList<>();
	public static List<Double> sepetFiyatlar = new ArrayList<>();

	public static void main(String[] args) {

		/*
		 * Yesil Market alis-veris programi.
		 * 
		 * 1. Adim: Urunler ve fiyatlari iceren listeleri olusturunuz. No Urun Fiyat
		 * ==== ======= ========= 00 Domates 2.10 TL 01 Patates 3.20 TL 02 Biber 1.50 TL
		 * 03 Sogan 2.30 TL 04 Havuc 3.10 TL 05 Elma 1.20 TL 06 Muz 1.90 TL 07 Cilek
		 * 6.10 TL 08 Kavun 4.30 TL 09 Uzum 2.70 TL 10 Limon 0.50 TL
		 * 
		 * 2. Adim: Kullanicinin urun nosuna gOre listeden urun secmesini isteyiniz. 3.
		 * Adim: Kac kg satin almak istedigini sorunuz. 4. Adim: Alinacak bu urunu
		 * sepete ekleyiniz ve Sepeti yazdiriniz. 5. Baska bir urun alip almak
		 * istemedigini sorunuz. 6. Eger devam etmek istiyorsa yeniden urun secme
		 * kismina yOnlendiriniz. 7. Eger bitirmek istiyorsa Odeme kismina geciniz ve
		 * Odem sonrasinda programi bitirinzi.
		 */
		Scanner scan = new Scanner(System.in);

		urunler.addAll(Arrays.asList("Avokado", "Domates", "Patates", "Biber", "Sogan", "Havuc", "Elma", "Muz", "Cilek",
				"Kavun", "Uzum", "Limon"));

		fiyatlar.addAll(Arrays.asList(27.5, 9.1, 8.2, 7.5, 6.3, 5.1, 4.2, 3.9, 6.1, 1.3, 2.7, 11.5));
		String devam;
		double toplamFiyat = 0.0;

		do {
			urunnListele();
			System.out.println("urunleri numaraya gore seciniz:");
			int urunNo = scan.nextInt();
			System.out.println("agirlik giriniz:");
			double kg = scan.nextDouble();
			sepeteEkle(urunNo, kg);
			toplamFiyat = Math.round(sepeteYazdir());
			System.out.println("Alis verise devam etmek istermisiniz:");
			devam = scan.next();
		} while (devam.equalsIgnoreCase("e"));

		odeme(toplamFiyat);
		scan.close();

	}

	public static void urunnListele() {
		System.out.println("No\t urunler \tFiyatlar");
		System.out.println("===\t ======== \t========");

		for (int i = 0; i < urunler.size(); i++) {
			System.out.println(" " + i + "\t" + urunler.get(i) + "\t \t   " + fiyatlar.get(i));
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

		System.out.println("urunn adi \tKG \tFiyati");
		System.out.println("=================================");
		for (int i = 0; i < sepeturunler.size(); i++) {
			System.out.println(sepeturunler.get(i) + "\t \t" + sepetKg.get(i) + "\t" + sepetFiyatlar.get(i));
			fiyatToplami += sepetFiyatlar.get(i);
			kgToplami += sepetKg.get(i);
		}

		System.out.println("=================================");
		System.out.println("\t TOPLAM:" + kgToplami + "\t" + fiyatToplami);

		return fiyatToplami;
	}

	public static void odeme(double toplamFiyat) {
		Scanner scan = new Scanner(System.in);

		System.out.println("***********************************");
		System.out.println("************* ODEME ***************");
		System.out.println("ODENECEK TOPLAM FIYAT:" + toplamFiyat);
//		System.out.printf("ODENECEK TOPLAM FIYAT: %.2f", toplamFiyat);
		double nakit = 0.0;
		do {
			System.out.print("Lutfen Nakit Giriniz:");
			nakit += scan.nextDouble();
			if (nakit < toplamFiyat) {
				System.out.println("Girilen Rakam yetersiz.");
				System.out.println((toplamFiyat - nakit) + " TL daha yatirmaniz gerekmektedir.");
			}
		} while (nakit < toplamFiyat);

		double paraustu = nakit - toplamFiyat;
		if (paraustu > 0) {
			System.out.println("PARA ustu :" + paraustu);
		}

		System.out.println("YiNE BEKLERiZ");
		scan.close();

	}

}
