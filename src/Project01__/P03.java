package Project01__;

import java.util.Scanner;

public class P03 {

	public static void main(String[] args) {
		/*
		 * Soru 3 Girilen bir string de kac tane b harfi oldugunu yazdiriniz...
		 */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir cumle veya kelime giriniz : ");
		String cumle = scan.nextLine();

		int sayac=0;
		for (int i = 0; i < cumle.length(); i++) {
			if (cumle.charAt(i)== 'b') {
				sayac++;
			}
		}
		
		System.out.println("Girilen cumledeki b harfi sayisi : " + sayac);
		
		
		
		
		
		
		scan.close();
	}
}