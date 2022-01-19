package Project01__;

import java.util.Random;
import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        System.out.print("Lutfen pozitif iki sayi giriniz"
        		+ "(ilk sayiyi girdikten sonra enter`a basiniz) : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
    
        Random r =new Random();
        
        if (num1>num2) {
        	int newNum = r.nextInt(num1);
        	if(newNum<num1 && newNum>num2) {
        		System.out.println(newNum);
        	}
		} 
        else if(num1<num2){
        	int newNum = r.nextInt(num2);
        	if(newNum>num1 && newNum<num2) {
        		System.out.println(newNum);
        	}
		}
        else {
        	System.out.println("Girilen sayilar birbirine esittir");
        }

        scanner.close();
	}

}
