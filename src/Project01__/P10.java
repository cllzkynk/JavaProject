package Project01__;

import java.util.Scanner;

public class P10 {

	public static void main(String[] args) {
		/*
		 * Soru 10 Girilen bir stringteki harf sayisi tek ise true , degilse false
		 * yazdiriniz.
		 */

		Scanner scanner = new Scanner(System.in);

		String str=scanner.nextLine();
		
		if (str.length()%2==1) {
			System.out.println(true);
		}else
			System.out.println(false);
		
		
		System.out.println(str.length());
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}

}
