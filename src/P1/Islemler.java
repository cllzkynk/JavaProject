package P1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

import OkulYonetimi_.Ogrenci;

public class Islemler {

    private List<Kisi> ogrenciListesi = new ArrayList<>();
    private List<Kisi> ogretmenListesi = new ArrayList<>();
    private String kisiTuru;




    public void anaMenu(){

        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" Ã–Ä�RENCÄ° VE Ã–Ä�RETMEN YÃ–NETÄ°M PANELÄ°");
        System.out.println("====================================");
        System.out.println("1- Ã–Ä�RENCÄ° Ä°Å�LEMLERÄ°");
        System.out.println("2- Ã–Ä�RETMEN Ä°Å�LEMLERÄ°");
        System.out.println("Q- Ã‡IKIÅ�");
        String secim = scan.next().toUpperCase();


        if(secim.equals("Q")){
           cikis();
        } else if (secim.equals("1")){
            kisiTuru ="OGRENCI";
            islemMenusu();

        } else if(secim.equals("2")){
            kisiTuru = "OGRETMEN";
            islemMenusu();

        } else {
            System.out.println("Yanlis giris yaptÄ±nÄ±z");
            anaMenu();
        }


    }
     private void islemMenusu(){

         Scanner scan = new Scanner(System.in);
         System.out.println("============= Ä°Å�LEMLER =============");
         System.out.println("1-EKLEME");
         System.out.println("2-ARAMA");
         System.out.println("3-LÄ°STELEME");
         System.out.println("4-SÄ°LME");
         System.out.println("5-ANA MENÃœ");
         System.out.println("Q-Ã‡IKIÅ�\n");
         System.out.println("SEÃ‡Ä°MÄ°NÄ°Z:");
         String tercih = scan.next().toUpperCase();
         switch (tercih){
             case "1" : ekle();     break;
          //   case "2" : ara();     break;
          //   case "3" : listele();     break;
          //   case "4" : sil();     break;
             case "5" : anaMenu();     break;
             case "Q" : cikis();     break;
             default:
                 System.out.println("HatalÄ± secim yaptÄ±nÄ±z");
                 islemMenusu();
                         break;
         }
     }
     private void cikis(){
         System.out.println("ProgramÄ± kullandÄ±gÄ±nÄ±z icin tesekkÃ¼rler");
     }

     private void ekle (){
        Scanner scan = new Scanner(System.in);
         System.out.println("---------- " + kisiTuru + "Ekleme SayfasÄ± ----------");
         System.out.println("Ad Soyad Giriniz");
         String adSoyad= scan.nextLine();
         System.out.println("Kimlik no giriniz");
         String kimlikNo=scan.next();
         System.out.println("YasÄ±nÄ±zÄ± giriniz");
         int yas = scan.nextInt();

         if(kisiTuru.equals("OGRENCI")){
             System.out.println("NumaranÄ±zÄ± Giriniz");
             String numara = scan.next();
             System.out.println("SÄ±nÄ±f Giriniz");
             String sinif = scan.next();
             Ogrenci ogrenci = new Ogrenci(adSoyad,kimlikNo,yas,numara,sinif);
             ogrenciListesi.addAll((Collection<? extends Kisi>) ogrenci);





         } else {

             System.out.println("Sicil no Giriniz");
             String sicilNo = scan.next();
             System.out.println("BÃ¶lÃ¼m Giriniz");
             String bolum = scan.next();
             Ogretmen ogretmen = new Ogretmen(adSoyad,kimlikNo,yas,bolum,sicilNo);
             ogretmenListesi.add(ogretmen);

         }

     }

}
