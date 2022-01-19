package OyunProjesi;

public class Envanter {

  private String silahAdi, zirhAdi;

  private int zirh, hasar;

  private boolean su, yiyecek, odun;

  public Envanter() {
    this.silahAdi = null;
    this.zirhAdi = null;
    this.zirh = 0;
    this.hasar = 0;
    this.su = false;
    this.yiyecek = false;
    this.odun = false;
  }

  public String getSilahAdi() {
    return silahAdi;
  }

  public void setSilahAdi(String silahAdi) {
    this.silahAdi = silahAdi;
  }

  public String getZirhAdi() {
    return zirhAdi;
  }

  public void setZirhAdi(String zirhAdi) {
    this.zirhAdi = zirhAdi;
  }

  public int getZirh() {
    return zirh;
  }

  public void setZirh(int zirh) {
    this.zirh = zirh;
  }

  public int getHasar() {
    return hasar;
  }

  public void setHasar(int hasar) {
    this.hasar = hasar;
  }

  public boolean isSu() {
    return su;
  }

  public void setSu(boolean su) {
    this.su = su;
  }

  public boolean isYiyecek() {
    return yiyecek;
  }

  public void setYiyecek(boolean yiyecek) {
    this.yiyecek = yiyecek;
  }

  public boolean isOdun() {
    return odun;
  }

  public void setOdun(boolean odun) {
    this.odun = odun;
  }
}
