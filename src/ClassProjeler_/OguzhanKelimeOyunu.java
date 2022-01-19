package ClassProjeler_;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class OguzhanKelimeOyunu {
    /*
      1- Kullaniciya kelimenin uzunlugu kadar hak tani
      2- Eger kelimedeki bir harf birden fazla varsa tahmini kelimedeki tum ayni harfler icin gecerli olsun
      3- That's it bro. Let's begin
     */

    final static String kelime = "JAVACANLAR";

    public static void main(String[] args) {


        String arr[] = kelime.split("");
        Integer hak = Arrays.stream(arr).distinct().map(String::length).reduce(Math::addExact).get();   //-> Kelimede farkli olan harf sayisi kadar hak verildi.
        hak += 5; //-> Extra 5 hak tanindi.
        System.out.println("Kelimedeki tum harfleri dogru bilip oyunu kazanmak icin toplam " + hak + " hakkiniz bulunmaktadir.");

        List<String> arrList = Arrays.asList(arr);   //-> Burada array'i bir list'e attim. Cunku ihtiyacim olan fonksiyonlara array sahip degil. Ve burada ya da array'de yaptigim degisiklikler birbirini etkiledigi bir problem olusmayacak.

        String tahminKelime = "";

        for (int i = 0; i < arr.length; i++) {
            tahminKelime += "_";
        }
        String arrKelime[] = tahminKelime.split("");

        List<String> kelimeList = Arrays.asList(arrKelime);  //-> Burada array'i bir list'e attim. Cunku ihtiyacim olan fonksiyonlara array sahip degil. Ve burada ya da array'de yaptigim degisiklikler birbirini etkiledigi bir problem olusmayacak.

        Scanner scan = new Scanner(System.in);

        while (hak > 0 && kelimeList.contains("_")) {

            kelimeList.stream().forEach(System.out::print);
            System.out.println();
            System.out.println("Lutfen bir harf giriniz. \nKalan hakkiniz " + hak);
            String tahmin = scan.next().toUpperCase();
            hak--;

            if (arrList.contains(tahmin)) {

                System.out.println("Tebrikler dogru tahminde bulundunuz " + tahmin);

                for (int i = 0; i < arr.length; i++) {

                    if (arr[i].equalsIgnoreCase(tahmin)) {

                        arrKelime[i] = arr[i];

                        arr[i] = "";

                    }
                }

            } else {

                if (kelimeList.contains(tahmin)) {
                    System.out.println("Bu harfi zaten dogru tahmin ettiniz :)");
                } else {

                    System.out.println("Girdiginiz harf kelimede bulunmamaktadir.");
                }
            }

        }
        boolean kazandiMi = kelimeList.stream().noneMatch(t -> t.equalsIgnoreCase("_"));

        if (kazandiMi) {

            System.out.println("Tebrikler oyunu kazandiniz " + kelime);

        } else {

            System.out.print("Maalesef kazanamazdiniz. Dogru kelime: " + kelime);

        }
    }
}