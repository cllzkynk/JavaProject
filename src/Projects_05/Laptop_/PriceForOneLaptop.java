package Projects_05.Laptop_;

import java.util.ArrayList;

public class PriceForOneLaptop {

    /*
         Parametresi int ve return tipi int olan GetPrice methodu veriliyor.

         Bu method, Data class dan AllData methodunu olusturuyor. LaptopID parametredir

        Bu yontemin Calculation class taki tum methodlari olusturmasi ve price  almasi ve
        totalAmount return etmesi gerekir.
     */


    public int getPrice(int laptopID) {

        Data data = new Data();

        ArrayList<String> arrayList = data.AllData(laptopID);

        int totalAmount = Calculation.getRam(arrayList) + Calculation.getColor(arrayList) +
                Calculation.getCPU(arrayList) +
                Calculation.getSize(arrayList);

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

    public int getDiscount(int num, int discount) {

        return num - (num * discount / 100);

    }

}
