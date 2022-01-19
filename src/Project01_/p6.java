package Project01_;

import java.util.Scanner;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 3 tane para birimi ve para miktari giriniz " +
				"\nExample : $15 \nherbirini girdikten sonra entera basiniz");
		String str1=scan.next();
		String str2=scan.next();
		String str3=scan.next();
		
		int toplam=0;
		
		String para1=str1;
		String para2=str2;
		String para3=str3;
		
				
		para1=para1.replaceAll("\\D", "");
		para2=para2.replaceAll("\\D", "");
		para3=para3.replaceAll("\\D", "");
		//System.out.println(para1);
		
		int p1=Integer.parseInt(para1);
		int p2=Integer.parseInt(para2);
		int p3=Integer.parseInt(para3);
		toplam=p1+p2+p3;
		
		System.out.println("Girdiginiz miktarlar : "+para1+","+para2+","+para3+" Toplami : "+toplam+" $");
		
		scan.close();
	}

}
