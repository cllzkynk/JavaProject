package OgrenciIsleri_;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciIsleri {
	/*
	 *
	 * OgrenciIsleri adinda bir class olusturun Ogrenci kayit, ogrenci goruntuleme,
	 * ogrenci silme ve cikis methodlari olusturun bu methodlari main methodda
	 * cagirin.
	 *
	 */
	public static Scanner scan = new Scanner(System.in);
	public static List<String> ogrenciler = new ArrayList<>();

	public static void main(String[] args) throws ArithmeticException{

		menu();

	}

	public static void menu() {
		System.out.println("Hangi islemi yapmak istersiniz \n1:Ogrenci Kayit\n2:Ogrenci Goruntuleme\n3:Ogrenci Silme"
				+ "\n4:Cikis");
		int secim = scan.nextInt();

		switch (secim) {
		case 1:
			ogrenciKayit();
			break;
		case 2:
			ogrenciGoruntuleme();
			break;
		case 3:
			ogrenciSilme();
			break;
		case 4:
			cikis();
			break;
		default:
			System.out.println("Yanlis giris yaptiniz");
		}
	}

	public static void ogrenciKayit() {
	
		System.out.println("Lutfen sirasiyla ogrenci numarasini, adini, soyadini ve ortalamasini giriniz");
		int numara = scan.nextInt();
		String ad = scan.next();
		String soyad = scan.next();
		double ortalama = scan.nextDouble();
		OgrenciOlusturma ogrenci = new OgrenciOlusturma(numara, ad, soyad, ortalama);
		String ogrenciBilgileri = numara +" " + ad + " " + soyad + " " + ortalama;
		
		ogrenciler.add(ogrenciBilgileri);
		
		menu();

	}

	public static void ogrenciGoruntuleme() {
		System.out.println("Kacinci ogrenciyi gormek istiyorsunuz");
		int secim = scan.nextInt();
		
		System.out.println(ogrenciler.get(secim));

		menu();
	}

	public static void ogrenciSilme() {
		System.out.println("Kacinci ogrencisi silmek istiyorsunuz");
		int secim = scan.nextInt();
		
		ogrenciler.remove(secim);
		System.out.println("Ogrenci silinmistir listemizin yeni hali");
		System.out.println(ogrenciler);
		
		menu();

	}

	public static void cikis() {
		System.out.println("Okul kayit sistemimizi kullandiginiz icin tesekkur eder iyi gunler dileriz");
		
	}

}
