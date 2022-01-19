package Project01__;

import java.util.Scanner;

public class P04 {

	public static void main(String[] args) {
        /* Soru 4
        Asagida verilen gun adlarina gore, Girilen bir gun numarasina karsilik gelen gun adini yazdiriniz...

         Eger int 1 ise print monday
         Eger int 2 ise print tuesday
         Eger int 3 ise print wednesday
         Eger int 4 ise print thursday
         Eger int 5 ise print friday
         Eger int 6 ise print saturday
         Eger int 7 ise print sunday
         Eger int 8 den buyuk ise  print "this is not a valid day"

         NOT : BU PROBLEMI COZERKEN SWITCH STATEMENT KULLANIN
       */
		Scanner scan = new Scanner(System.in);
		System.out.print("Lutfen bir gun numarasi giriniz : ");
		int gun = scan.nextInt();
		
		
		switch (gun) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;	
		
		default:
			System.out.println("this is not a valid day");
		}

		
		scan.close();
	}

}
