package day37.hastane;

public class Departman extends Hastane {

  int departmanId;
  String departmanAdi;

  public Departman() {}

  public Departman(
    String adi,
    String adres,
    String tel,
    int departmanId,
    String departmanAdi
  ) {
    super(adi, adres, tel);
    this.departmanId = departmanId;
    this.departmanAdi = departmanAdi;
  }
  public Departman departmanEkle() {

    Departman dp=new Departman("Hizmet", "İzmitte bir yer", "0543", 1, "Dahiliye");

      return dp;
  }
}
