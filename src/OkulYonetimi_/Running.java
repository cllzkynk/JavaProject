package OkulYonetimi_;

public class Running {
    public static void main(String[] args) {
       Islemler islem= new Islemler();
       islem.topluListe();
       islem.anaMenu();

       //Islemler.anaMenu();   variable lar static olsaydı böyle çağırabilirdik
    }
}
