package Projects_05.ProjeLaptopss_;




import java.util.ArrayList;

public class LaptopFiyati {

     /*
         Parametresi int ve return tipi int olan GetPrice methodu veriliyor.

         Bu method, Data class dan AllData methodunu olusturuyor. LaptopID parametredir

        Bu yontemin Calculation class taki tum methodlari olusturmasi ve price  almasi ve
        totalAmount return etmesi gerekir.

     */


    public static int GetPrice(int LaptopID){
        Data bilgi = new Data();
        ArrayList<String> urunOzellikleri=bilgi.AllData(LaptopID);

        int totalAmount= Calculation.getRam(urunOzellikleri)+Calculation.getCPU(urunOzellikleri)+
                Calculation.getSize(urunOzellikleri)+Calculation.getcolor(urunOzellikleri);

        return totalAmount;


    }

         /*
        Parameter iki tane int (amount , discount) ve return tipi int olan getDiscount methodu veriliyor.

        Miktardan(amount)  indirim(discount) yapin

        indirilmis fiyati return edin


        Ornek

        Amount 100
        discount 20

        20% indirimden sonra

        Sonuc 80 olmali
     */



    public static int getDiscount(int amount, int discount){

        return (amount-(amount*discount)/100); // indirim hesaplamasi yap,mis olduk
    }











}
