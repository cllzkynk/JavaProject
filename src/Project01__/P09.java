package Project01__;


import java.util.Scanner;

public class P09 {

	public static void main(String[] args) {
	    /* Soru 9
	    Girilen bir sayiya kadar olan cift sayilari
	    (0 ve girilen sayi dahil) yazdiriniz...

	    Example 1:
	    int input = 10;

	    print  0 2 4 6 8 10  olmali

	    Example 2:
	    int input = 15;

	    print  0 2 4 6 8 10 12 14  olmali
	     */


		Scanner scanner = new Scanner(System.in);
		int ciftSayilar=scanner.nextInt();
		
		for (int i = 0; i <=ciftSayilar; i++) {
				if (i%2==0) {
					System.out.print(i+ " ");
				}
				scanner.close();
			}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
