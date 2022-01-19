package Kutuphane_;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Kutuphane extends Kitap{


    static Scanner scan = new Scanner(System.in);
    public static int count = 1001;
    public static Map<Integer, Kitap> kitaplar = new HashMap<>();

    static {
        Kitap kitap1 = new Kitap("Nutuk", "Kemal Ataturk", "1927", 56.5);
        kitaplar.put(count, kitap1);
        count++;
        Kitap kitap2 = new Kitap("Calikusu", "Resat Nuri Guntekin", "1923", 75);
        kitaplar.put(count, kitap2);
        count++;
        Kitap kitap3 = new Kitap("Les miserables", "Victor Hugo", "1862", 20.5);
        kitaplar.put(count, kitap3);
        count++;
    }

    /*
     * Müşterileriler kütüphaneleri için bir kitap yönetim sistemi tasarlamanızı
     * istiyorlar.
     *
     * 1.Bu programda kitaplar, Kitap Adı, Yazar Adı, Yayın Yılı ve Fiyat gibi
     * bilgiler içerebilmelidir.
     *
     * 2. Program, kitaplara 1001’den başlayarak sıralı ve otomatik numara
     * vermelidir.
     *
     * 3. Kullanıcı sisteme Kitap eklemeyebimeli, silebilmeli, arama ve tüm
     * kitapları listeleme gibi işlemleri yapabilmelidir.
     *
     * 4. Programın başlangıcında Kullanıcıya aşağıdaki gibi bir menü sunulmalıdır
     * ve Kullanıcı programı bitirene kadar işlemlere devam edebilmelidir.
     *
     * ========= KİTAP PROGRAMI ============= 1: Kitap ekle 2: Numara ile kitap sil
     * 3. Numara ile kitap ara 4: Tüm kitapları listele 5: Bitir
     *
     *
     *
     */
    public static void kitapSilme() {
        System.out.println("Silmek istediginiz kitabin no'sunu giriniz");
        int secim = scan.nextInt();

        if (kitaplar.containsKey(secim)) {
            kitaplar.remove(secim);
            System.out.println(secim + " nolu kitap silindikten sonraki kitap listesi");
            int j = 1;
            for(int i = 1001; i<count; i++) {

                if(kitaplar.containsKey(i)) {
                    System.out.println(j + ". Kitap");
                    System.out.println("Kitap No:" + i + kitaplar.get(i));
                    System.out.println("==============================");
                    j++;
                }
            }

        } else {
            System.out.println("Girdiginiz Kitap numarasi Kutuphanemizde mevcut degildir.");
            kitapSilme();
        }
        menu();
    }

    public static void bitirme() {
        System.out.println("Bizi tercih ettiginiz icin tesekkur eder, yine bekleriz");
    }

    public static void menu() {


        System.out.println("========= KİTAP PROGRAMI =============\nHangi islemi yapmak istersiniz  \n1:Kitap ekle \n2:Numara ile kitap sil "
                + "\n3:Numara ile kitap ara \n4:Tum kitaplari listele \n5:Bitir");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:
                kitapEkleme();
                break;
            case 2:
                kitapSilme();
                break;
            case 3:
                kitapArama();
                break;
            case 4:
                kitapListeleme();
                break;
            case 5:
                bitirme();
                break;
            default:
                System.out.println("Yanlis giris yaptiniz");
        }
    }
    public static void kitapListeleme() {
        int j = 1;
        for(int i = 1001; i<count; i++) {

            if(kitaplar.containsKey(i)) {
                System.out.println(j + ". Kitap");
                System.out.println("Kitap No:" + i + kitaplar.get(i));
                System.out.println("==============================");
                j++;
            }

        }
        menu();
    }

    public static void kitapArama() {
        System.out.println("Lutfen aramak istediginiz kitabin no'sunu giriniz");
        int secim = scan.nextInt();
        if(kitaplar.containsKey(secim)) {
            System.out.println(kitaplar.get(secim));
        }else {
            System.out.println("Arama yaptiginiz kitap kutuphanemizde mevcut degildir.");
        }

        menu();
    }

    public static void kitapEkleme() {
        scan.nextLine();
        System.out.println("lutfen kitap adini giriniz");
        String kitapIsmi = scan.nextLine();
        System.out.println("kitabin yazarinin adini giriniz");
        String yazarAd = scan.next();
        System.out.println("Kitabin yazarinin soyadini giriniz");
        String yazarSoyAd = scan.next();
        System.out.println("Lutfen yayin yilini giriniz");
        String yayinyili = scan.next();
        System.out.println("Lutfen kitabin fiyatini giriniz");
        double kitapfiyat = scan.nextDouble();
        Kitap kitap = new Kitap(kitapIsmi, yazarAd + " " + yazarSoyAd, yayinyili, kitapfiyat);
        kitaplar.put(count, kitap);



        count++;
        menu();
}}
