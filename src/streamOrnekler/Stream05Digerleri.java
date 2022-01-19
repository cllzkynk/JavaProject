package streamOrnekler;

import java.util.List;
import java.util.stream.*;

public class Stream05Digerleri {

    public static void main(String[] args) {


        System.out.println("Toplam : " + topla(4));

        System.out.println("==========");

        System.out.println("Toplam1 : " + topla1(4));

        System.out.println("====================");

        tekTopla(1,7);
        System.out.println( "Faktoriyel : " + faktoriyel(10));
        System.out.println( "Faktoriyel 1 : " + faktoriyel(5));
        System.out.println( "Faktoriyel 2 : " + faktoriyel(30));
        System.out.println("Notları 50 den büyük olanlar : " + doubleDiziCevirList());


    }

    //****************************************************************************************************
    // ÖRNEK25: 1'den belirtilen değere kadar olan tamsayıları toplayan ve sonucu döndüren metodu yazınız.
    //****************************************************************************************************

    public static int topla(int deger){

      return   IntStream.range(1, deger+1).sum();

    }

    public static int topla1(int deger){

        return IntStream.rangeClosed(1,deger).sum();
    }

    public static void tekTopla(int alt , int ust){
        System.out.println(  IntStream.rangeClosed(alt,ust). filter(Methotlar::tekMi).sum());



    }

    //****************************************************************************************************
    // ÖRNEK27: Belirtilen sayının faktoriyelini hesaplayan metodu yazınız.
    //****************************************************************************************************

    public static int faktoriyel(int n){

       // return IntStream.rangeClosed(1,n).reduce(1, (x,y)-> x*y);
        return  IntStream.iterate(1, t->t+1).limit(n).reduce(1, (x,y)-> x*y)    ;
    }

    public static Long faktoriyel1(int n){
        return LongStream.rangeClosed(1,n).reduce(1, (x, y)-> x*y);
    }

    public static double faktoriyel2(int n){
        return DoubleStream.
                iterate(10, x->x+1).limit(n).
                reduce(1 , (x,y)-> x*y);
    }



    public static List<Double> doubleDiziCevirList (){
        Double[] notlar = {88.5 , 52.3, 88.9 , 100.0 , 99.6, 42.0, 10.0};
        Stream <Double> streamNotlar =  Stream.of(notlar);
         return  streamNotlar.filter(t -> t>50.0).collect(Collectors.toList());

    }

}
