package streamProje01;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Main {

    private static List<Ogrenci>ogrListesi=new ArrayList<>();
    public static void main(String[] args) {


        testOgrenciOlustur();

        System.out.println("==================İsmeGoreSirala==========");
        ismeGoreListele("Ayşe");
        System.out.println("============SoyismeGoreSirala===========");
        soyismeGoreSirala("Can");
        System.out.println("=============YasaGore=====================");
        yasaGoreListele(30);
        System.out.println("================DiplomaNotu============");
        diplomaNotu(0);
        System.out.println("==============SınıfOrtalaması==========");
        sinifOrtalamasi();
        System.out.println("==========CinsiyeteGöre===============");
        cinsiyeteGoreSirala("erkek");
        System.out.println("=========YasaVeCinsiyeteGore==========");
        yasaVeCinsiyeteGore(18, "erkek");

















    }

    private static void yasaVeCinsiyeteGore(int yas, String cinsiyet) {

        ogrListesi.stream().filter(x-> x.getYas() > yas && x.getCinsiyet().equalsIgnoreCase(cinsiyet)).forEach(System.out::println);


    }

    private static void cinsiyeteGoreSirala(String cinsiyet) {

        ogrListesi.stream().filter(x-> x.getCinsiyet().equalsIgnoreCase(cinsiyet)).forEach(System.out::println);

    }

    private static void sinifOrtalamasi() {

        //ogrListesi.stream().filter(x-> x.getDiplomaNotu()>0).map(x-> x.getDiplomaNotu() +)
           OptionalDouble  Avarage =  ogrListesi.stream().mapToDouble(Ogrenci::getDiplomaNotu).average();
           System.out.println(Avarage);

    }

    private static void diplomaNotu(double not ) {
        ogrListesi.stream().filter(x-> x.getDiplomaNotu()>not).forEach(System.out::println);




    }

    private static void yasaGoreListele(int yas) {

        ogrListesi.stream().filter(x-> x.getYas() > yas).forEach(System.out::println);



    }

    private static void soyismeGoreSirala(String soyAd) {
        ogrListesi.stream().filter(t-> t.getSoyAd() .equalsIgnoreCase(soyAd)).forEach(System.out::println);

    }

    private static void ismeGoreListele(String isim) {

        ogrListesi.stream().filter(x-> x.getAd().equalsIgnoreCase(isim)).forEach(System.out::println);

    }


    private static void testOgrenciOlustur(){
        ogrListesi.add(new Ogrenci("Ahmet", "Can", 30, 95.5, "erkek"));
        ogrListesi.add(new Ogrenci("Ahmet", "Baki", 18, 90.1, "erkek"));
        ogrListesi.add(new Ogrenci("Ayşe", "Can", 21, 82.3, "kadın"));
        ogrListesi.add(new Ogrenci("Mustafa", "Can", 15, 75.4, "erkek"));
        ogrListesi.add(new Ogrenci("Fatma", "Yılmaz", 40, 45, "kadın"));
        ogrListesi.add(new Ogrenci("Ali", "Veli", 80, 35.5, "erkek"));
        ogrListesi.add(new Ogrenci("Veli", "Öztürk", 20, 95.5, "erkek"));


    }

}
