package Project01__;

import java.util.Scanner;

public class P01 {

	public static void main(String[] args) {

	/* Soru 1
	 * Kullanicidan yas bilgisini isteyiniz
	 * 
	 * Eger yas 10 dan kucuk veya esit ise
	 * "facebook hesabi acmak icin cok gencsin"
	 * seklinde yazdirin
	 * 
	 * Eger yas 16 dan kucuk veya esit ise  ise
	 * "ehliyet almak icin cok gencsin" seklinde yazdirin
	 * 
	 * Eger yas 18 dan kucuk veya esit ise  ise
	 * "dovme yaptirmak icin cok gencsin"
	 * eklinde yazdirin
	 * 
	 * Eger yas 21 dan kucuk veya esit ise ise
	 * "alkol icmek icin cok gencsin" seklinde yazdirin
	 * 
	 * Eger yas 21 den buyuk ise
	 * "istedigini yapabilirsin" seklinde yazdirin
	 */
	

		Scanner scan = new Scanner(System.in);
		System.out.print("lutfen yasinizi giriniz : ");
		int yas = scan.nextInt();
		
		if (yas<=10) {
			System.out.println("facebook hesabi acmak icin cok gencsin");
		}else if (yas<=16) {
			System.out.println("ehliyet almak icin cok gencsin");
		}else if (yas<=18) {
			System.out.println("dovme yaptirmak icin cok gencsin");
		}else if (yas<=21) {
			System.out.println("alkol icmek icin cok gencsin" );
		}else
			System.out.println("istedigini yapabilirsin");
		
		
		scan.close();
	}
		
	
		
		
	}
	

