package day37.hastane;

public class Person extends Departman {

  public Person() {}

  String kisiAdi;
  String kisiAdres;
  int yas;
  String kisiTel;

  public Person(
    String adi,
    String adres,
    String tel,
    int departmanId,
    String departmanAdi,
    String kisiAdi,
    String kisiAdres,
    int yas,
    String kisiTel
  ) {
    super(adi, adres, tel, departmanId, departmanAdi);
    this.kisiAdi = kisiAdi;
    this.kisiAdres = kisiAdres;
    this.yas = yas;
    this.kisiTel = kisiTel;
  }
}
