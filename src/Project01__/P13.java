package Project01__;

import java.util.Random;
import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {

	    /*
	     Girilen 2 sayi arasinda Random integer sayi ureten programi yaziniz.
	     */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen iki tam sayi giriniz : \nilk sayiyi girdikten sonra enter'a basiniz ");
		
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		Random r=new Random();
		
		int kucuk=sayi1>sayi2 ? sayi2 : sayi1 ; 
		int buyuk=sayi2>sayi1 ? sayi2 : sayi1 ; 
		
		int result=r.nextInt(buyuk-kucuk)+kucuk;
		System.out.println(result);
		
		
		scan.close();
		
		
	}

}
