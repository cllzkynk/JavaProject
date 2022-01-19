package Projects_05.ProjeLaptopss_;

  

import java.util.Scanner;

public class LaptoRun {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Data liste = new Data();

        for (int i = 1100000; i <=1100008 ; i++) {
            System.out.println("Urun id : " + i +"\n"+ liste.AllData(i));

        }

        LaptopFiyati f1 = new LaptopFiyati();
        System.out.println("Lutfen istediginiz urunun id sini giriniz : ");
        int sayi=f1.GetPrice(scan.nextInt());
        System.out.println();
        System.out.println("Toplam fiyati : " + sayi + "\nIndirimli Fiyat : " + f1.getDiscount(sayi, 20) );


    }
}
