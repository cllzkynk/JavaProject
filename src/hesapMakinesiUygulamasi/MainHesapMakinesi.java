package hesapMakinesiUygulamasi;

import java.util.Scanner;

public class MainHesapMakinesi {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Lütfen 1. sayıyı giriniz : ");

    double sayi1 = scan.nextDouble();

    System.out.print("Lütfen 2. sayıyı giriniz : ");

    double sayi2 = scan.nextDouble();

    HesapMakinesi hsp = new HesapMakinesi(sayi1, sayi2);

    System.out.println("Sayıların toplamı : "+hsp.topla());

    System.out.println("Sayıların farkı : "+hsp.cikar());

    System.out.println("Sayıların çarpimi : "+hsp.carp());

    System.out.println("Sayıların bölümü : "+hsp.bol());

  }
}
