package streamOrnekler;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Stream04String {

    public static void main(String[] args) {

        List<String> liste = new ArrayList<>();
        liste.add("Ali");
        liste.add("Mark");
        liste.add("Jackson");
        liste.add("Amanda");
        liste.add("Mariano");
        liste.add("Alberto");
        liste.add("Tucker");
        liste.add("Christ");
        liste.add("Alfonso");

        aiLeBaslayanlar(liste);
        System.out.println("");
        buyukHarfeCevir(liste);
        uzunlugaGoreSiralaKucult(liste);
        uzunlugaGoreYazdir(liste, 3);
        System.out.println("Tüm elemanlar belirtilen değerden kücük " + uzunlukKucukmu(liste, 7));
        System.out.println("Baslayan yokmu" + baslamayanHarfVarmi(liste, "B"));
        System.out.println("Biten harf Varmı " + herhangiBitenElemanVarmi(liste, "r"));
        System.out.println("======================");
        aileBasOilebit(liste);
        System.out.println("===========================");
        Kk(liste);
        System.out.println("===========================");
        yazdir(liste);

    }
    // Listedeki bas harfi A ile baslayan isimleri yazdıran method tanımlayalım

    public static void aiLeBaslayanlar(List<String> liste) {
        liste.stream().filter(h -> h.startsWith("A")).forEach(System.out::println);
    }

    //Listedeki tüm isimleri büyük harfe ceviren methodu tanımlayalım
    public static void buyukHarfeCevir(List<String> liste) {
        liste.stream().map(h -> h.toUpperCase()).forEach(System.out::println);
    }


    //******************************************************
    // Listedeki tüm elemanları uzunluklarına göre sıralayan ve kücük harfe ceviren methodu tanımlayalım

    public static void uzunlugaGoreSiralaKucult(List<String> liste) {
        liste.stream().
                sorted(Comparator.comparing(t -> t.length())).
                map(t -> t.toLowerCase()).forEach(System.out::println);
    }


    //Listedeki tüm elemanları uzunlukları belirtilen uzunluktan fazla ise bunları
    //olanları yazdıran methodu tanımlayalım

    public static void uzunlugaGoreYazdir(List<String> liste, int uzunluk) {
        liste.stream().filter(t -> t.length() > uzunluk).forEach(System.out::println);
    }



    //Listedeki tüm elemanların uzunlukları belirtilen uzunluktan Kücükmü
    // diye kontrol eden methodu yazınızi
    //*****************************************************************************************
    // ÖRNEK20: Listedeki TÜM elemanların uzunlukları belirtilen uzunluktan KÜÇÜK mü
    // diye kontrol eden metodu yazınız.
    //*****************************************************************************************
    //ALLMATCH() Belirtilen şartları tüm elemanlar sağlıyorsa true döndürür. yoksa false

    public static boolean uzunlukKucukmu(List<String> liste, int uzunluk) {

        return liste.stream().allMatch(t -> t.length() < uzunluk);
    }



    //Listedeki tüm elemanların belirtilen harf ile başlamadıgını
    // kontrol eden metodu yazınız

    // --** Non match **  belirtilen şartları tüm elemanlar sağlıyorsa true döndürür



    public static boolean baslamayanHarfVarmi(List<String> liste, String harf) {

        return liste.stream().noneMatch(t -> t.startsWith(harf));


    }

    //Listedeki herhangi bir eleman belirtilen bir harf ile bitiyormu diye kontrol eden

    // anyMatch () : herhangi bir sartin saglanip saglanmamasina bakar,
    // sart bir defa saglaniyorsa true dondurur, hic sagmanmiyorsa false


    public static boolean herhangiBitenElemanVarmi(List<String> liste, String harf) {
        return liste.stream().anyMatch(t -> t.endsWith(harf));
    }


    public static void aileBasOilebit(List<String> liste) {

        liste.stream().
                filter(a -> a.startsWith("A") && a.endsWith("o")).
                                              forEach(System.out::println);

    }


    //****************************************************************************************************
    //  ÖRNEK24: Aşağıdaki formata göre listedeki her bir elemanın uzunluğunu yazdıran metodu yazınız.
    //  Ali: 3        Mark: 4       Amanda: 6     vb.
    //****************************************************************************************************

    public static void Kk(List<String> liste) {

         liste.
                stream().
                     sorted(Comparator.comparing(t -> t.length())).
                                            map(t -> t + ": " + t.length()).
                                                          forEach(System.out::print);


    }

    public static void yazdir(List<String> liste){

        liste.stream().
                map(String::toLowerCase).
                           filter(x-> x.startsWith("a")).
                                          forEach(System.out::println);

    }



    }








