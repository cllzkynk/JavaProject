package SatisStokSistemi;

public class MainSiparisSistemi {

  public static void main(String[] args) {
    Urun u1 = new Urun("Arcelik", 500.0, 25);
    Musteri m1 = new Musteri("Muzaffer", "Istanbul", "9823587");
    Siparis siparis = new Siparis(m1, u1, 5);

    siparis.faturaYaz();
  }
}
