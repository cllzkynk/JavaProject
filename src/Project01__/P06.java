package Project01__;

import java.util.Scanner;

public class P06 {

	public static void main(String[] args) {
		/* Soru 6
	     Icinde negatif de olabilen sayinin ve para sembolunun
	     oldugu asagidaki gibi 3 tane String okutunuz.
	     okunan bu 3 string icindeki negatif de olabilen sayilari toplatin.
	     Toplam pozitif ise toplami yazdirin,
	     eger toplam negatif ise sadece -1 yazdirin.

	         Ornek:
	        String num1 = "$15";
	        String num2 = "$20";
	        String num3 = "$30";
	        output ----> 65; olmali

	        String num1 = "$15";
	        String num2 = "$-80";
	        String num3 = "$30";
	        output ----> -1; olmali
	    */
		Scanner scan = new Scanner(System.in);
		
		String num1 = "$15";
        String num2 = "$80";
        String num3 = "$30";
        
        num1=num1.replace("$", "");
        num2=num2.replace("$", "");
        num3=num3.replace("$", "");
        
       Integer num4 =Integer.parseInt(num1);
       Integer num5 =Integer.parseInt(num2);
       Integer num6 =Integer.parseInt(num3);
       
       int toplam =num4+num5+num6;
        
        if(toplam>=0) {
       	 System.out.println(toplam);
        }
        else {
       	 System.out.println("-1");
        }

		

		
		
		
		
		
		
		
		
		
		
		
		
		

		     scan.close();   
		}


		   
		 


	}


