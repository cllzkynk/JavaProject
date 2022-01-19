package ClassProjeler__;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KelimeTahminOyunu {
      /*
    kelime tahmin etme oyunu
    6 tane tahmin hakkı verelim
    kelimeyi dogru girerse tebrikler desin
    ve oyunu bitirsin
    6 hakkı bitirince uzgunuz bilemezdiniz desin tahmin kelimesini yazdırsın
     */

    public static void main(String[] args) throws IOException {
        String kelime = "merve";
        int i, tahmin = 0, bitis = 0, count = 0;
        String arr[] = new String[kelime.length()];
        System.out.println("Kelimeyi bulmak icin 6 hakkiniz var.");
        BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));
        for (i = 0; i < kelime.length(); i++) {
            arr[i] = "_ ";
        }

        while (tahmin < 6) {
            System.out.println("Bir harf giriniz (Kalan hakkiniz " + (6 - tahmin) + ") : ");
            String karakter = klavye.readLine();
            tahmin++;
            for (i = 0; i < kelime.length(); i++) {
                if (kelime.charAt(i) == karakter.charAt(0)) {
                    arr[i] = karakter + " ";
                    bitis = 1;
                    count++;
                    if (count == kelime.length()) {
                        System.out.println("kelime " + kelime + "...Tebrikler...");
                        break;
                    }
                }
            }
            if (bitis == 1) {
                bitis = 0;
                tahmin--;
            }
            for (i = 0; i < kelime.length(); i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        if (count != kelime.length()) {
            System.out.println("Uzgunum... Dogru yanit " + kelime);
        }
    }

}
