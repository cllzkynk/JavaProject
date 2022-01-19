package Projects_05.ProjeLaptopss_;

import java.util.ArrayList;

public class Calculation {

     /*
        getRam methodunu olusturalim

        Parametresi  ArrayList<String> olsun


        Eger ram 32 gb ise price 300 ekle
        Eger ram 16 gb ise price 200 ekle
        Eger ram 8 gb ise price 100 ekle
        Eger ram 4 gb ise price 50 ekle
        return  price olmali.
        Not price -- fiyat
     */
    Data bilgi1 = new Data();

    public static int getRam(ArrayList<String> ram ){
        int price = 0;


        if (ram.get(2).equalsIgnoreCase("32 gb")) {
            price += 300;
        } else if (ram.get(2).equalsIgnoreCase("16 gb")) {
            price += 200;
        } else if (ram.get(2).equalsIgnoreCase("8 gb")) {
            price += 100;
        } else if (ram.get(2).equalsIgnoreCase("4 gb")) {
            price += 50;

        }
        return price;
    }

      /*
        getCPU  methodunu olusturalim

        Parametresi  ArrayList<String> olsun


        Eger CPU i3 ise price 200 ekle
        EgerCPU i5 ise price 300 ekle
        Eger CPU i7 ise price 500 ekle

        return  price olmali.
     */

    public static int getCPU(ArrayList<String> CPU ){
        int price = 0;

        if (CPU.get(3).equalsIgnoreCase("i3")) {
            price += 200;
        } else if (CPU.get(3).equalsIgnoreCase("i5")) {
            price += 300;
        } else if (CPU.get(3).equalsIgnoreCase("i7")) {
            price += 500;

        }
        return price;
    }
    /*
       getColor methodunu olusturalim

       Parametresi  ArrayList<String> olsun

       return türü int olmali


       Eger Color Red ise ise price 400 ekle
       Eger Color Orange ise price 300 ekle
       Eger Color Silver ise price 200 ekle
       Eger Color Black ise price 150 ekle


       return  price olmali.

    */
    public static int getcolor(ArrayList<String> color ){
        int price = 0;

        if (color.get(4).equalsIgnoreCase("Red")) {
            price += 400;
        } else if (color.get(4).equalsIgnoreCase("Orange")) {
            price += 300;
        } else if (color.get(4).equalsIgnoreCase("Silver")) {
            price += 200;
        } else if (color.get(4).equalsIgnoreCase("Black")) {
            price += 150;
        }
        return price;
    }

    /*
        getSize  methodunu olusturalim

        return türü int olmali

        Parametresi  ArrayList<String> olsun


        Eger Size "Mini" içeriyorsa price 100 ekle
        Eger Size "Middle" içeriyorsa price 200 ekle
        Eger Size "Max" içeriyorsa price 300 ekle


        return  price olmali.
     */

    public static int getSize(ArrayList<String> size) {

        int price = 0;


            if (size.get(1).contains("Mini")) {
                price += 100;
            } else if (size.get(1).contains("Middle")) {
                price += 200;
            } else if (size.get(1).contains("Max")) {
                price += 300;

        }
        return price;
    }
}

