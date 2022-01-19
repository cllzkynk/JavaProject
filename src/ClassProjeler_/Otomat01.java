package ClassProjeler_;

import java.util.*;

public class Otomat01 {
	 /*
    Merhaba arkadaslar, javadan proje yapmak isteyen arkadaslar vardi...
 projemizin adi YIYECEK OTOMATI
 --15 adet urun ve bu urunlerin fiyatlarini belirleyiniz.
 Bu urunler ekranda listelensin
 --Ürun secip, para miktari giriniz
 --girdiginiz para fazla ise ustunu versin,
 eksik ise ekleme yapmanizi istesin
 --Ek urun secme secenegi olsun, siz devam ettiginiz surece,
 para kontrolunu de yaparak islem yapmaya devam etsin...
 NOT: Otomat sadece 1 tl , 5 tl, 10 tl, 20 tl miktarlarini kabul etsin
 oop concepte ait ögrendiklerimizi kullanmaya calisalim...
 iyi calismalar
 Kolay gelsin...
     */
	
	public static List<String> urunler = new ArrayList<String>();
    public static List<Double> fiyatlar = new ArrayList<Double>();
    static HashMap<String, Double> urunler2 = new HashMap<>();
    public static List<String> sepettekiUrunler = new ArrayList<String>();
    public static List<Double> sepettekiFiyat = new ArrayList<Double>();
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        urunler.addAll(Arrays.asList("topkek", "biskrem", "cips", "fanta", "sut",
                "hanimeller", "gofgof", "metro", "albeni", "luppo", "kitkit",
                "kitkat", "haribo", "halley", "eti cin", "papagan cekirdegi"));
        fiyatlar.addAll(Arrays.asList(2.5, 4.0, 7.5, 4.8, 6.0, 3.0, 5.0, 1.5, 1.2, 2.5, 3.4, 6.5, 4.6, 8.4, 2.6, 6.5));
        int no;
        String cevap = "";
        do {
            urunleriListele();
            System.out.println("Lutfen almak istediginiz urun no giriniz");
            no = scan.nextInt();
            System.out.println("Devam etmek istiyor musnz?(E/H)");
            cevap = scan.next();
            sepeteEkle(no);
            fiyatEslestirme(urunler, fiyatlar);
        } while (cevap.equalsIgnoreCase("e"));
        System.out.println(urunler2);
        odeme(sepettekiFiyat);
    }

    private static void odeme(List<Double> sepettekiFiyat) {
        double toplam = 0;
        double miktar = 0;
        for (int i = 0; i < sepettekiFiyat.size(); i++) {
            toplam += sepettekiFiyat.get(i);
        }
        System.out.println("odemeniz gereken toplam tutar = " + toplam);
        do {
            toplam -= miktar;
            System.out.println("Lutfen paranizin miktarini giriniz");
            miktar = scan.nextDouble();
            if (miktar == 1 || miktar == 5 || miktar == 10 || miktar == 20) {
                if (toplam > miktar) {
                    System.out.println(toplam - miktar + "tl daha girmeniz gerek");
                } else if (toplam < miktar) {
                    System.out.println(miktar - toplam + "tl para ustunuz var");
                    System.out.println("Alisveris tamamlanmistir. Iyi gunler dileriz");
                } else if (toplam == miktar) {
                    System.out.println("Alisveris tamamlanmistir. Iyi gunler dileriz");
                }
            } else {
                System.out.println("Lutfen gecerli bir miktar giriniz");
                miktar = scan.nextDouble();
                break;
            }
        } while (!(miktar >= toplam));
    }

    public static void fiyatEslestirme(List<String> urunler, List<Double> fiyatlar) {
        double sepettekiToplam = 0;
        for (int i = 0; i < sepettekiUrunler.size(); i++) {
            sepettekiToplam += sepettekiFiyat.get(i);
        }
    }

    public static HashMap<String, Double> sepeteEkle(int no) {
        sepettekiUrunler.add(urunler.get(no));
        sepettekiFiyat.add(fiyatlar.get(no));
        for (int i = 0; i < sepettekiUrunler.size(); i++) {
            urunler2.put(sepettekiUrunler.get(i), sepettekiFiyat.get(i));
        }
        return urunler2;
    }

    public static void urunleriListele() {
        System.out.println("no\turunler\t\tfiyatlar");
        System.out.println("-----------------------------------------------");
        for (int i = 1; i < urunler.size(); i++) {
            System.out.println(i + "\t" + urunler.get(i) + "\t\t" + fiyatlar.get(i));
        }
    }
}