package streamOrnekler;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

import java.util.stream.Stream;

public class Stream06Files {


    public static void main(String[] args) throws IOException {

        String path = "src/streamOrnekler/mars.txt";

        Stream<String> satirlar =Files.lines(Path.of("src/streamOrnekler/mars.txt"));
        satirlar.forEach(System.out::println);
        System.out.println("=================================================================");

       Files.lines(Path.of(path)).
                 map(x-> x.toUpperCase()).
                         forEach(System.out::println);

        System.out.println("================================================================");


        Files.lines(Path.of(path)).limit(1).
                map(x-> x.toUpperCase()).
                forEach(System.out::println);


        System.out.println("================================================================");


                Files.
                lines(Path.of(path)).
                map(String::toUpperCase).
                skip(2).
                limit(2).
                forEach(System.out::println);


        System.out.println("================================================================");


                System.out.println
                (Files.lines(Path.of(path)).
                map(String::toLowerCase).
                filter(t-> t.contains("a")).
                count());

        System.out.println("================================================================");

        Files.lines(Path.of(path)).
                map(t-> t.toLowerCase().split(" "))
                .flatMap(Arrays::stream).
                distinct().forEach(System.out::println);


        /// Map : Stream'in transformasyon method'udur. Veriyi degistirir.
        // FlapMap : Nested olan Collection'lari dumuduz bir hale getiriyor, islenmesi kolay olsun diye.


        System.out.println("=================================================================");

        long mSayisi = (Files.lines(Path.of(path)).
                map(t-> t.toLowerCase().
                        split("")).
                flatMap(Arrays::stream).
                filter(t-> t.contains("m")).
                count());
        System.out.println("M harfinin sayisi : " + mSayisi);


        System.out.println("==================================================================");

        //Boşluk ve noktalama işaretleri hariç dosyada kaç adet karakter kullanıldığını
        // hesaplayarak sonucu konsola yazdıran uygulamayı yazınız.

        System.out.println(Files.lines(Path.of(path)).
                map(t-> t.replace("_" , "").
                replaceAll("\\W" , "").split(""))
                .flatMap(Arrays::stream).count());



    }


}
