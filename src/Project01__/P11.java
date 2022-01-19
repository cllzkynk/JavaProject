package Project01__;

import java.util.Scanner;

public class P11 {

	public static void main(String[] args) {
		 /* Soru 11
        Scanner class kullanilarak verilen iki tane Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, 
        ikinci kelimenin ilk harfi ile ayni ise
        ayni olan harflerin birisini kaldirin..

        Ornek:     "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen iki kelime giriniz. \nbirini girdikten sonra enter'a basiniz");
		String str1=scan.next();
    	String str2=scan.next();
    	
    	
    	if (str1.charAt(str1.length()-1)==str2.charAt(0)) {
			System.out.println(str1.substring(0,str1.length())+str2.substring(1));
		}else {
			System.out.println(str1.concat(str2));
		
		
	}

    	scan.close();
}
}