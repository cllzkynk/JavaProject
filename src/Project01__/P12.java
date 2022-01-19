package Project01__;

import java.util.Random;
import java.util.Scanner;

public class P12 {

	public static void main(String[] args) {
		  /*

		   Kullanicidan pozitif bir sayi aliniz ve
		   0 ile girilen sayi arasinda Random int tipinde bir sayi ureten programi yaziniz.

		   not : girilen sayi uretilen sayilara dahil olmali

		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("pozitif bir tam sayi gieniz : ");
		
		int sayi=scan.nextInt();
		
		Random r=new Random();
		
		sayi=r.nextInt(sayi+1);

		    	System.out.println(sayi);
		
		
		scan.close();
		
		    }
		
		    
	

}
