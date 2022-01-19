package urunDepolama_map_;

import java.util.Scanner;

public class Runner {
	/*
	 * basit bir depo projesi
	 * 
	 * Calisan bir fabrikada uygulanan bir sistem olan depo uygulamasidir.
	 * 
	 * 1-) burada oncelikle urunun tanimlamasi  yapilir. id urunIsmi uretici miktar birim ve raf (6 adet fields mevcut)
	 * 
	 * 2-) methodlar olusturacagiz.
	 * 		urunTanimlama 	==> burda urunun ismi ureticisi ve birimi girilecek. id count yapilarak alanacak.
	 * 		
	 * 		urunListele 	==> tanimlanan urunler listelenecek. foreack kullanarak urunleri listeleyebiliriz.
	 * 		*** burada urunun adeti ve raf numarasi tanimlama yapilmadiysa default deger gorunsun.
	 * 		
	 * 		urunGirisi 		==> burada listelenen urunlere bakacagizz. giris yapmak istedigimiz urnunun id numarasini girecegiz.
	 * 		giris yapmak istedigimiz urunun id numarasini girdikten sonra ne kadar giris yapmak istedigimizi yazacagiz.
	 * 		id numarasindaki tum degisikligi yazdiracagiz.
	 * 		
	 * 		urunuRafaKoy 	==> listeden urunu sececegiz ve id numarasina gore urunu rafa koyacagiz.
	 * 
	 *		urunCikisi 		==> listeden urunu sececegiz ve urunun cikis yapcagiz. burada urun listesinden sadece miktarda degisiklik yapilacak.
	 *							urun adedi 0dan az olamaz. 0 olunca urun tanimlamasi silinmesin. sadece miktari 0 olsun.
	 * 		===> yaptigimiz tum degisiklikler listede de gorunsun.
	 * 
	 * 
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	0 			cuval 		null
	 * 
	 * 		urunGirisi		==> id:1000  urun girisi :5
	 * 		urunListele 	==>
	 * 		
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	5 			cuval 		null
	 * 
	 * 		urunuRafaKoy 	==> id:1000 raf : raf1
	 * 		urunListele 	==>
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	5 			cuval 		raf1
	 * 
	 * 		urunCikisi 		==> id 1000: urun cikis : 3 (kalan 2 cuval un)
	 * 		urunListele 	==>
	 * 			id		ismi 	ureticisi	miktari		birimi		raf
	 * 		---------------------------------------------------------------
	 * 		or: 1000	 un 	hekimoglu	2 			cuval 		raf1
	 * 
	 * 
	 */
	
	public static int secenek;
	public static void main(String[] args) {
		
		M01 objm = new M01();
		
		
		do {
			menu();
			switch (secenek) {
			case 1:
				objm.urunTanimlama();
				break;
			case 2:
				objm.urunListele();
				break;
			case 3:
				objm.urunGirisi();	
				break;
			case 4:
				objm.urunuRafaKoy();	
				break;
			case 5:
				objm.urunCikisi();	
				break;			
			}
			
		} while (secenek!=6);
		System.out.println("IYI GUNLER DILERIZ.");
		

	}

	private static void menu() {		
		System.out.println(
				  "+===== MAIN MENU====+\r\n"
				+ "|1: URUN EKLE       |\r\n"
				+ "|2: URUNLERI LISTELE|\r\n"
				+ "|3: URUN GIRISI     |\r\n"
				+ "|4: RAF GIRISI      |\r\n"
				+ "|5: URUN CIKIS      |\r\n"
				+ "|6: CIKIS           |\r\n"
				+ "+-------------------+");
		System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SEECINIZ?");
		Scanner scan = new Scanner (System.in);
		secenek=scan.nextInt();
	}

}
