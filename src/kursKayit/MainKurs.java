package kursKayit;

import java.time.LocalDate;

public class MainKurs {

  public static void main(String[] args) {
    Kurslar kurs1 = new Kurslar(
      "Boyama Kursu",
      LocalDate.of(2021, 9, 1),
      25,
      60
    );
    Kurslar kurs2 = new Kurslar(
      "El İşi Kursu",
      LocalDate.of(2021, 10, 1),
      15,
      35
    );

    System.out.println(Ogrenciler.okulAdi);
    Ogrenciler ogr1 = new Ogrenciler(1, "Salih", 25);
    Ogrenciler ogr2 = new Ogrenciler(1, "Yağmur", 23);
    KursKayit kayit1 = new KursKayit(ogr1, kurs1, LocalDate.now());
    kayit1.kayitYaz();
    System.out.println("Kayıt sayısı : " + KursKayit.kayitSayisi);
    System.out.println(ogr2.adi + "'nin Okul adı : " + ogr1.okulAdi);
    Ogrenciler.okulAdi = "Fatih Vatan Lisesi";
    KursKayit kayit2 = new KursKayit(ogr2, kurs2, LocalDate.now());

    System.out.println(ogr1.adi + "'nin Okul adı : " + ogr1.okulAdi);
    System.out.println(
      "Şuanda kursa kayıtlı öğrenci sayısı : " + KursKayit.kayitSayisi
    );
    kayit1.kayitSil(kayit1.ogrenci);
    System.out.println("Kayıt sayısı : " + KursKayit.kayitSayisi);
  }
}
