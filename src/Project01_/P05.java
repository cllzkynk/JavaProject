package Project01_;

import java.util.Scanner;

public class P05 {

	public static void main(String[] args) {
		 /* Soru 5
        Girilen bir sayinin faktoriyel degerini
        bulmak icin bir program yazin.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("lutfen pozitif bir tam sayi girin ");
		int sayi = scan.nextInt();

		int faktoryel=1;
		
		for (int i = 1; i <=sayi; i++) {
			faktoryel*=i;
		}
		
		System.out.println("Girdiginiz sayinin faktoreyeli : " + faktoryel);
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
	}
}