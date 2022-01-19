package Project01_;

import java.util.Scanner;

public class P08 {

	public static void main(String[] args) {
		/*
		 * Girilen pozitif bir sayinin tam kare olup olmadigini bulunuz, tamkare ise
		 * true degilse false yazdiriniz.
		 * 
		 * Not: sqrt gibi fonksiyonlari kullanmayin.
		 * 
		 * Example 1: Input: 16 Output: true Not: bu sayi tamkare cunku 4*4 = 16
		 * 
		 * Example 2: Input: 25 Output: true Note: bu sayi tamkare cunku 5*5=25
		 * 
		 * 
		 * Example 3: Input: 14 Output: false
		 * 
		 */

		Scanner scanner = new Scanner(System.in);
		System.out.print("L�tfen pozitif bir say� giriniz : ");
		int input = scanner.nextInt();

		int a = 0;
		int b = 0;

		for (int i = 0; i < input / 2 + 1; i++) {
			if (i * i == input) {
				a = 1;
				b = i;
				break;
			}
		}

		System.out.print(a == 1 ? "true" : "false");

		if (a == 1) {

			System.out.print(" Not: Girdiginiz sayi tamkare : " + b + "*" + b + "=" + input);
		}


		scanner.close();
	}

}