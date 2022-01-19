package ClassProjeler_;

import java.util.Scanner;

public class KisiselBilgiler{
	
	/*
	 * Kisisel Bilgi Sistemi
	 * 
	 * 1---> isiminiz giriniz ismi duzenleyip ilk harf buyuk olacak ve 
	 * digerleri * olacak sekilde yazdiriniz... 
	 * Girilen ismin palindrome olup olmadigini kontrol ediniz...
	 * 
	 * 2---> Soyisminizi giriniz... Soyismi duzenleyip ilk harf buyuk olacak ve
	 * digerleri * olacak sekilde yazdiriniz...
	 * 
	 * 3---> Emailinizi @ kismina kadar giriniz 4 secenek olusturup bunlari sorunuz..
	 * Asagidaki e-posta adreslerinden uygun olani seciniz
	 * 1-@gmail.com
	 * 2-@hotmail.com
	 * 3-@yahoo.com
	 * 4-@yandex.com
	 * 
	 * Email ile e posta adresini concat yapiniz..
	 * 
	 * 4---> Sifre giriniz...
	 * Lutfen asagidaki kriterlere uygun bir sifre seciniz
	 * 1-ilk harfi buyuk olmali
	 * 2-son harfi kucuk olmali
	 * 3-bosluk olmamali
	 * 4-8 karakterden az olmamali
	 * 
	 * 5---> Kredi Karti numarinizi giriniz.. 
	 * Bosluk birakmadan 16 hane olarak yazdirmasini isteyiniz
	 * Console da ; **** **** **** 1234 Seklinde yazdiriniz..
	 * 
	 * 6---> Kisa bir aciklama giriniz.. 
	 * isEmpty(), endsWith(), startsWith(), toLowerCase() 
	 * methodlarini kullanarak yazdiriniz.. 
	 * Girilen Aciklamayi tersten yazidiriniz..
	 * 
	 */
	
	public static void main(String[] args) {
		
	
	Scanner scanner = new Scanner(System.in);
	boolean cikilsinMi=false;
	while(!cikilsinMi) {
	System.out.println("*********KISISEL BILGI SISTEMI********");
	System.out.println("1-Isiminizi Giriniz\n2-Soyisminizi giriniz\n3-Email adrsini giriniz"
			+ "\n4-Sifrenizi Giriniz\n5-Kredi Karti numranizi Giriniz\n6-Kisa bir not birakiniz\n7-Cikis");

	System.out.print("Lutfen bir secim yapiniz : ");
	String secim = scanner.nextLine();
	
	switch (secim) {
	case "1": 
		System.out.println("Lutfen isminizi yaziniz : ");
		String isim=scanner.nextLine();
		String isimDuzenlenmis = isim.substring(0,1).toUpperCase() +
				 isim.substring(1).replaceAll("\\w", "*"); 
		System.out.println(isimDuzenlenmis);
		
		String terstenIsim = "";
		for (int i = 0; i < isim.length(); i++) {
			terstenIsim += isim.substring(isim.length() - 1 - i, isim.length() - i);
		}
		if (isim.equals(terstenIsim)) { 
			System.out.println("Girilen isim palindromdur");
		} else {
			System.out.println("Girilen isim palindrom degildir");
		}
		break;
	case "2": 
		System.out.println("Lutfen soyisminizi yaziniz");
		String soyisim=scanner.nextLine();
		String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase()+ 
				soyisim.substring(1).replaceAll("\\S", "*");
		System.out.println(soyisimDuzenlenmis);
	break;
	case "3":
		System.out.println("Lutfen emailinizi @ kismina kadar yaziniz");
		String email=scanner.nextLine();
		  System.out.print("\nAsagidaki e-posta adresilerinden uygun olani seciniz?\n" + "1-@gmail.com\n" +
		  "2-@hotmail.com\n" + "3-@yahoo.com\n" + "4-@yandex.com\n" + "Tuslayiniz: ");
          String ePosta = scanner.nextLine();

          if (ePosta.equals("1")) {
              System.out.println("@gmail.com");
              System.out.println(email.concat("@gmail.com"));
          } else if (ePosta.equals("2")) {
              System.out.println("@hotmail.com");
              System.out.println(email.concat("@hotmail.com"));
          } else if (ePosta.equals("3")) {
              System.out.println("@yahoo.com");
              System.out.println(email.concat("@yahoo.com"));
          } else if (ePosta.equals("4")) {
              System.out.println("@yandex.com");
              System.out.println(email.concat("@yandex.com"));
          } else {
              System.out.println("Hatali islem yaptiniz...");
          }
	break;
	case "4":
		int kontrol=0;
		do {
			System.out.println("Lutfen su kriterlere uygun sifre giriniz\n" + "1-Bas harf buyuk olmali\n"
					+ "2-Son harf buyuk olmali\n"
					+ "3-Bosluk olmamali\n" + "4-Uzunluk 8 karakter icermeli\n");
			String sifre = scanner.nextLine();

			boolean ilkHarfKont = sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z';
			boolean sonHarfKontrol = sifre.charAt(sifre.length() - 1) >= 'a' &&
					sifre.charAt(sifre.length() - 1) <= 'z';
			boolean spaceKontrol = !sifre.contains(" ");
			boolean uzunlukKontrol = sifre.length() >= 8;


			if (ilkHarfKont && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
				System.out.println("Sifre basari ile tanimlandi");
				kontrol=1;
			} else {
				System.out.println("Islem basarisiz, Lutfen kriterlere uygun bir sifre giriniz");
			}
		}while(kontrol==0);
	break;
	case "5":
		System.out.println("Lutfen Kredi Karti no giriniz");
		String kkNo=scanner.nextLine();
		String kkNoDuzenlenmis= "**** **** **** " + kkNo.substring(12); 
		System.out.println(kkNoDuzenlenmis);
	break;
	case "6":
		System.out.println("Kisa bir aciklama giriniz");
		String aciklama=scanner.nextLine();
		System.out.println(aciklama.isEmpty());
		System.out.println(aciklama.endsWith("."));
		System.out.println(aciklama.toLowerCase().startsWith("d"));
		for (int i = aciklama.length()-1; i >= 0; i--) {
			System.out.print(aciklama.substring(i,i+1));
		}
		System.out.println("");
	break;
	case "7":
		System.out.println("Cikis yapiliyor...\nIsleminiz basarisiyla gerceklestirildi !!!");
		cikilsinMi=true;
	break;
	default:
		System.out.println("Uygun bir secim yapmadiniz. Tekrar deneyiniz...");
		break;
	}
	
	}
	scanner.close();
	
	}
}

