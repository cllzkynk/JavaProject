package OyunProjesi;

import java.util.Scanner;

public class Player {

  protected String isim, kIsim;
  protected int can, para, hasar, saglik;
  Envanter envanter;
  Scanner scan = new Scanner(System.in);

  public Player(String isim) {
    this.isim = isim;
    this.envanter = new Envanter();
  }

  public void karakterSec() {
    switch (karMenu()) {
      case 1:
        olusturPlayer("Samuray", 5, 10, 100);

        break;
      case 2:
      olusturPlayer("Okçu", 8, 12, 120);

        break;
      case 3:
      olusturPlayer("Şövalye",7 , 20, 70);

        break;
      default:
      olusturPlayer("Samuray", 5, 10, 100);
        break;
    }

    System.out.println("Karakter oluşturuldu ! "+"\nİsim : "+getIsim());
  }

  public int karMenu() {
    System.out.print("Bir karakter seçiniz : ");
    System.out.println("1- Samuray ");
    System.out.println("2- Okçu ");
    System.out.println("3- Şövalye ");

    System.out.println("Karakter seçiminiz");
    int karId = scan.nextInt();
    while (karId < 1 || karId > 3) {
      System.out.println("Lütfen geçerli bir karater numarası giriniz.");
      karId = scan.nextInt();
    }
    return karId;
  }

  public void olusturPlayer(String kIsim, int hasar, int saglik, int para) {
      setIsim(kIsim);
      setHasar(hasar);
      setSaglik(saglik);
      setPara(para);
      setCan(saglik);
  }

  public String getIsim() {
    return isim;
  }

  public void setIsim(String isim) {
    this.isim = isim;
  }

  public String getkIsim() {
    return kIsim;
  }

  public void setkIsim(String kIsim) {
    this.kIsim = kIsim;
  }

  public int getCan() {
    return can;
  }

  public void setCan(int can) {
    this.can = can;
  }

  public int getPara() {
    return para;
  }

  public void setPara(int para) {
    this.para = para;
  }

  public int getHasar() {
    return hasar;
  }

  public void setHasar(int hasar) {
    this.hasar = hasar;
  }

  public int getSaglik() {
    return saglik;
  }

  public void setSaglik(int saglik) {
    this.saglik = saglik;
  }

  public Envanter getEnvanter() {
    return envanter;
  }

  public void setEnvanter(Envanter envanter) {
    this.envanter = envanter;
  }

  public Scanner getScan() {
    return scan;
  }

  public void setScan(Scanner scan) {
    this.scan = scan;
  }
}
