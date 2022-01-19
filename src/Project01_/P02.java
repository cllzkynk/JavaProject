package Project01_;

import java.util.Scanner;

public class P02 {

	public static void main(String[] args) {
		/* Soru 2
		 * Girilen bir sayi cift ise "true" ,
		 * tek ise "false" yazdiriniz
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir sayi giriniz : ");
		int sayi = scan.nextInt();

		
		if (sayi%2==0) {
			System.out.println("Girdiginiz sayi cift sayi : " + true);
		}else
			System.out.println("Girdiginiz sayi tek sayi : " + false);
		
	
		
		scan.close();
	}

}

