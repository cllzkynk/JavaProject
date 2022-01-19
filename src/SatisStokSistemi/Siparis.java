package SatisStokSistemi;

public class Siparis {

  Musteri musteri;
  Urun urun;
  int miktar;

  public Siparis() {}

  public Siparis(Musteri musteri, Urun urun, int miktar) {
    this.musteri = musteri;
    this.urun = urun;
    this.miktar = miktar;
  }

  public void faturaYaz() {
    System.out.println(
      "Alisveris icin tesekkurler " +
      musteri.adi +
      ". \nFaturaniz asagida ozetlenmistir :\n" +
      miktar +
      " tane " +
      urun.fiyat +
      " liradan alinan urun icin toplam faturaniz : " +
      urun.fiyat *
      miktar
    );
    System.out.println(
      "Faturaniz asagidaki adrese gonderilcektir : \n" + musteri.adres
    );
  }
}
