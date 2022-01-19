package streamOrnekler;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream03Integer {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(12);
        liste.add(9);
        liste.add(13);
        liste.add(4);
        liste.add(9);
        liste.add(2);
        liste.add(4);
        liste.add(12);
        liste.add(-1);
        liste.add(15);
        liste.add(500);
        liste.add(-15);


        System.out.println("En BÜYÜK DEĞER:" + buyukBul(liste));
        System.out.println("En BÜYÜK DEĞER:" + buyukBul1(liste));
        System.out.println("En Kücük DEĞER:" + kucukBul(liste));
        System.out.println("Carpim degeri:" + carpimbul(liste));
        System.out.println(dokuzSay(liste));

        List<Integer>negatifler = negatifSayiListesi(liste);
        System.out.println("Negatif liste : " + negatifler);
        System.out.println("\nTek sayilarin sirali karesi : " + tekKareSiraliListele(liste));


    }

    public static int buyukBul(List<Integer> liste) {
        return liste.stream().reduce(0, (x, y) -> x > y ? x : y);
    }

    public static int buyukBul1(List<Integer> liste) {
        return liste.stream().reduce(0, Math::max);
    }

    public static int buyukBul2(List<Integer> liste) {
        return liste.stream().sorted().reduce(0, (x, y) -> y);
    }

    public static int kucukBul(List<Integer> liste) {
        return liste.stream().reduce(0, (x, y) -> x < y ? x : y);
    }


    public static int carpimbul(List<Integer> liste) {
        return liste.stream().reduce(1, (x, y) -> x * y);
    }

    //Liste icerisinde kac tane 9 sayisi bulunmaktadir.
    //Bunu bulan bir method yazalım.
    public static int dokuzSay(List<Integer> liste) {
        return (int) liste.stream().filter(x -> x == 9).count();


    }
    //Listedeki negatif sayıları yazdıran method
    public static void  negatifSayilariYazdir(List<Integer>liste){
        liste.stream().filter(x-> x<0).forEach(System.out::print);
    }

    //Listedeki negatif sayıları bir liste olarak döndüren method
    public static  List<Integer> negatifSayiListesi(List<Integer> liste) {
       return  liste.stream().filter(x-> x<0).collect(Collectors.toList());
    }

    //Listedeki tek elemanların karelerini sıralı olarak ve tekrarsız
    // bir sekilde listeye kaydeden metodu yazınız

    public static List<Integer> tekKareSiraliListele(List<Integer>liste){
        return  liste.
                stream().
                filter(Stream01Integer::tekMi).
                map(x-> (int)Math.pow(x,5)).  //map(Math::pow).
                distinct().
                sorted().
                collect(Collectors.toList());
    }

}