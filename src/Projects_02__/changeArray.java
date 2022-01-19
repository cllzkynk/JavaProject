package Projects_02__;

import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

    /* Sedef Hocam
     
       String bir array verildiginde
       Eger String Orange iceriyorsa butun  Orange leri Apple a cevir
       Ornek:
       Array : Peach , Berry , Orange , WaterMelon , Orange
       Result boyle olmali --> : Peach , Berry , Apple , WaterMelon , Apple
       Arrayi print edin
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

         //        Koda burdan basla
         //        kullanman gereken -> UseThisArray

 
        for (int i = 0; i < UseThisArray.length; i++) {
        	
			if (UseThisArray[i].equals( "Orange")) {
				
				UseThisArray[i]="Apple";
			}
			
		}
        System.out.println(Arrays.toString(UseThisArray));

        scan.close();
    }
}