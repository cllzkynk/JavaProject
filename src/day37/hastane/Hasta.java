package day37.hastane;

public class Hasta extends Person {

  String sikayet;

  public Hasta() {}

  public Hasta(
    String adi,
    String adres,
    String tel,
    int departmanId,
    String departmanAdi,
    String kisiAdi,
    String kisiAdres,
    int yas,
    String kisiTel,
    String sikayet
  ) {
    super(
      adi,
      adres,
      tel,
      departmanId,
      departmanAdi,
      kisiAdi,
      kisiAdres,
      yas,
      kisiTel
    );
    this.sikayet = sikayet;
  }
}
