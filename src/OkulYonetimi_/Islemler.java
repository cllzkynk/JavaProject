package OkulYonetimi_;

import java.util.HashMap;
import java.util.Scanner;

public class Islemler {
   // BIR OKUL YONETIM PLATFORMU KODLAYINIZ.
//
//	1.	Bu programda, Ogrenci ve Ogretmen Kayitlari ile ilgili islemler yapilabilmelidir.
//		Kayitlarda su bilgiler olabilmelidir.
//
//		Ogretmen: Ad-Soyad,  kimlik No, yas, bolum, ve sicil No bilgileri icermelidir.
//		Ogrenci: Ad-Soyad,  kimlik No, yas, numara, sinif bilgileri icermelidir.
//
//	2.	Program basladiginda Kullaniciya, Ogretmen ve Ogrenci islemlerini secebilmesi icin
//		Asagidaki gibi bir menu gosterilsin.
//
//	====================================
//	 OGRENCI VE OGRETMEN YONETIM PANELI
//	====================================
//	 1- OGRENCI ISLEMLERI
//	 2- OGRETMEN ISLEMLERI
//	 Q- CIKIS
//
//	3.	Secilen Kisi turune gore asagidaki islemleri gosteren bir alt menu daha gosterilsin.
//
//	============= ISLEMLER =============
//		 1-EKLEME
//		 2-ARAMA
//		 3-LISTELEME
//		 4-SILME
//		 5-ANA MENU
//		 Q-CIKIS
//
//	SECIMINIZ:
//
//	4.	Islemler menusunde secilen isleme gore bir onceki menude secilen Kisi turu ile ilgili
//	    ekleme, kimlik no ile silme ve arama, var olan tum kisileri listeleme gibi islemler yapilabilmelidir.
//		Bunun yaninda bir ust menuye donme veya cikis islemleri de yapilabilmelidir.


         String kisiTuru;   // buna static yazarsak running classinda obje olusturmadan class ismiyle direk cagirabiliriz
         int ogrenciNo = 1002;
         int ogretmenNo = 2000;
         Scanner scan = new Scanner(System.in);
         HashMap<Integer, Ogrenci> ogrenciListesi = new HashMap<>();
         HashMap<Integer, Ogretmen> ogretmenListesi = new HashMap<>();



         public  void anaMenu() {
            System.out.println("====================================");
            System.out.println(" OGRENCI VE OGRETMEN YONETIM PANELI");
            System.out.println("====================================");
            System.out.println("LUTFEN ISLEM YAPMAK ISTEDIGINIZ ISLEMI SECINIZ :\n1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");

             String secim = scan.next().toUpperCase();

            if (secim.equals("Q")) {
                cikis();
            } else if (secim.equals("1")) {
                kisiTuru = "OGRENCI";
                islemMenusu();

            } else if (secim.equals("2")) {
                kisiTuru = "OGRETMEN";
                islemMenusu();

            } else {
                System.out.println("Yanlis giris yaptiniz..");
                anaMenu();
            } }
        private  void cikis() {System.out.println("Programi kullandiginiz icin tesekkurler..");
        }
        private  void islemMenusu() {

            System.out.println("============= ISLEMLER =============");
            System.out.println("1-EKLEME\n2-ARAMA\n3-LISTELEME\n4-SILME\n5-ANA MENU\nQ-CIKIS\n");
            System.out.println("LUTFEN YAPMAK ISTEDIGINIZ ISLEMI SECINIZ: ");
            String tercih = scan.next().toUpperCase();
            switch (tercih) {
                case "1":
                    ekle();
                    break;
                case "2":
                    ara();
                    break;
                case "3":
                    listele();
                    break;
                case "4":
                    sil();
                    break;
                case "5":
                    anaMenu();
                    break;
                case "Q":
                    cikis();
                    break;
                default:
                {System.out.println("Hatali secim yaptiniz.");
                    islemMenusu();}
                break;
            }
        }
        //===================================================================================
        private  void sil() { // return type a gerek yok map ler kaydoluyor
            System.out.println("------------- " + kisiTuru + " SILME SAYFASI ----------------"); //sonra yaz
            if (kisiTuru.equals("OGRENCI")) {
                System.out.println("Silmek istediginiz ogrencinin (1000 ile baslayan)ogrenciNo sunu giriniz");
                int ogrenciNoo = scan.nextInt();
                if (ogrenciListesi.containsKey(ogrenciNoo)) {
                    ogrenciListesi.remove(ogrenciNoo);
                    System.out.println(ogrenciNoo+"nolu ogrenci silinmistir");
                    System.out.println("YENI LISTE\n"+ogrenciListesi);} //bu sart degil gormek icin

                else System.out.println(ogrenciNoo + " numarali ogrenci bulunamadi");}

            else {System.out.println("Silmek istediginiz (1000 ile baslayan)ogretmenin ogretmenNo sunu giriniz");
                int ogretmenNoo = scan.nextInt();
                if (ogretmenListesi.containsKey(ogretmenNoo)) {
                    ogretmenListesi.remove(ogretmenNoo);
                    System.out.println(ogretmenNoo+"nolu ogretmen silinmistir");
                    System.out.println("YENI LISTE\n"+ogretmenListesi);}
                else System.out.println(ogretmenNoo + " numarali ogretmen bulunamadi");}

            islemMenusu();
        }
        //=====================================================================================
        private  void ara() {     // return type a gerek yok map ler kaydoluyor
            System.out.println("------------- " + kisiTuru + " ARAMA SAYFASI ----------------");

            if (kisiTuru.equals("OGRENCI")){
                System.out.println("Aramak istediginiz ogrencinin (1000 ile baslayan ) ogrenciNo sunu giriniz");
                int ogrenciN = scan.nextInt();

                if (ogrenciListesi.containsKey(ogrenciN)) {
                    System.out.println(ogrenciListesi.get(ogrenciN));}
                else System.out.println(ogrenciN + " numarali ogrenci bulunamadi");}

            else {System.out.println("Aramak istediginiz ogretmenin (1000 ile baslayan) ogretmenNo sunu giriniz");
                int ogretmenN = scan.nextInt();
                if (ogretmenListesi.containsKey(ogretmenN)) {
                    System.out.println(ogretmenListesi.get(ogretmenN));} else {
                    System.out.println(ogretmenN + " numarali ogretmen bulunamadi");
                }}
            islemMenusu();
        }
        //============================================================================
        private  void ekle() {
            System.out.println("------------- " + kisiTuru + " EKLEME SAYFASI ----------------");
          //  Scanner scan =new Scanner(System.in);  //buraya tekrar yazmayinca scan leri birlestiriyor, bos scan.nextLine eklenmeli
            System.out.println("Ad Soyad Giriniz:");
            String adSoyad = scan.nextLine();
            scan.nextLine(); //iste bu gerekiyor ***************
            System.out.println("Kimlik No Giriniz:");
            String kimlikNo = scan.next();
            System.out.println("Yasinizi Giriniz:");
            int yas = scan.nextInt();

            if(kisiTuru.equals("OGRENCI")){
                System.out.println("Numaranizi giriniz:");
                String numara = scan.next();
                System.out.println("Sinif giriniz:");
                String sinif = scan.next();

                //  Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
                //mesela, Map string,string olsaydi cons olusturmadan direk ogrencilistesi.put(100,"ali") yazabilirdik

                ogrenciListesi.put(ogrenciNo++,new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif));

                // System.out.println(ogrenciNo +" no'lu "+ogrenciListesi.get(ogrenciNo) +" isimli ogrenci listeye eklenmistir");
               //listeyi yazdirirsak numara atio o yuzden burada yazmiyoruz, gerekirse listele yapariz
            }else {
                System.out.println("Sicil No giriniz:");
                String sicilNo = scan.next();
                System.out.println("Bolum giriniz:");
                String bolum = scan.next();

                ogretmenListesi.put(ogretmenNo++,new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo));
            }
            islemMenusu(); }

        //==================================================================================
        private  void listele() {

        if (kisiTuru.equals("OGRENCI"))

          System.out.println(ogrenciListesi);

      else
           System.out.println(ogretmenListesi);
            islemMenusu();
        }
//========================================================================================
        public void topluListe()  {  //return type a gerek yok collection ve map ler icine kaydediyor
            //burada yazdirmiyoruz proje calistiginda ilk etapta gozukmesin diye,

            //Ogrenci ogrenci1=new Ogrenci("Ali Can","11111",14,"111","fen");
            ogrenciListesi.put(ogrenciNo++,new Ogrenci("celil oz","12345",10,"123","Java"));
            //mesela, Map string,string olsaydi cons olusturmadan direk ogrencilistesi.put(100,"ali") yazabilirdik

            ogrenciListesi.put(ogrenciNo++,new Ogrenci("Haluk","2222",14,"333","jupiter avcisi"));

                ogretmenListesi.put(ogretmenNo++,new Ogretmen("Bilgin","9999",34,"","1212"));

}}

