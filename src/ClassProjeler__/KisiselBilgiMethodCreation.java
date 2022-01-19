package ClassProjeler__;

import java.util.Scanner;

public class KisiselBilgiMethodCreation {
			
			static Scanner scan=new Scanner(System.in);
			static String str=new String();
			public static void main(String[] args) {
			
				menu();
				scan.close();
			}
			///----------------------------------------->>>
			private static void menu() {
				boolean cikilsinMi=false;
				while(!cikilsinMi) {
					System.out.println("lutfen bir sayi seciniz : "
							+ "1-Isiminizi Giriniz\n2-Soyisminizi giriniz\n3-Email adrsini giriniz"
							+ "\n4-Sifrenizi Giriniz\n5-Kredi Karti numranizi Giriniz\n6-Cikis");
				String islem=scan.nextLine();
				switch (islem) {
				case "1": isim();
					break;
				case "2": soyisim();
				break;
				case "3": email();
				break;
				case "4": sifre();
				break;
				case "5": kredi();
				break;
				case "6":System.out.println("Cikis yapiliyor");
				cikilsinMi=true;
				break;
				default:
					System.out.println("Uygun bir menu secmediniz");
					break;
				}
				}
			}
			///----------------------------------------->>>
			private static void kredi() {
				System.out.println("Lutfen Kredi Karti no giriniz");
				String kkNo=scan.nextLine();
				String kkNoDuzenlenmis= "**** **** **** " + kkNo.substring(12); 
				System.out.println(kkNoDuzenlenmis);
			/*	Collections.sort(isimler);
				listele();*/
			}

			///----------------------------------------->>>
			 /*Kullanicidan bir sifre girmesini isteyin. 
			 Asagidaki sartlari sagliyorsa "Sifre basari ile tanimlandi",
			 sartlari saglamazsa "IIslem basarisiz,Lutfen yeni bir sifre girin" yazdirin
			- Ilk harf buyuk harf olmali
			- Son harf kucuk harf olmali
			- Sifre bosluk icermemeli
			- Sifre uzunlugu en az 8 karakter olmali*/
			
			private static void sifre() {
				System.out.println("Lutfen sifreyi giriniz");
				String sifre=scan.nextLine();
				
				boolean ilkHarfKont = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' ; 
				boolean sonHarfKontrol=sifre.charAt(sifre.length()-1)>='a' &&
										sifre.charAt(sifre.length()-1)<='z';
				boolean spaceKontrol= !sifre.contains(" ");
				// basa ! koymazsam " " varsa true, " " yoksa false olur
				// basa ! koyuyoyorum ki space olmadiginda true donsun
				boolean uzunlukKontrol = sifre.length()>=8;
				
				
				if(ilkHarfKont && sonHarfKontrol && spaceKontrol && uzunlukKontrol) {
					System.out.println("Sifre basari ile tanimlandi");
				}else {
					System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
				}
				
			}
			///----------------------------------------->>>
			/*
			 Kullanicidan bir e-posta adresi girmesini isteyin,
			 ardindan "hotmail" iceriyorsa, "gmail" ile degistirin,
			 Ornegin: johnbrown@hotmail.com ==> johnbrown@gmail.com
			 */
			private static void email() {
				System.out.println("Girmek istediginiz emaili yaziniz");
				String email=scan.nextLine();
				 if(email.contains("hotmail")){
				     email = email.replace("hotmail", "gmail");
				 }
				 System.out.println(email);
				
			}
			///----------------------------------------->>>
			private static void soyisim() {
				System.out.println("Girmek istediginiz soyismi yaziniz");
				String soyisim=scan.nextLine();
				String soyisimDuzenlenmis = soyisim.substring(0,1).toUpperCase()+ 
						soyisim.substring(1).replaceAll("\\S", "*");
				System.out.println(soyisimDuzenlenmis);

			}
			///----------------------------------------->>>
			private static void isim() {
				System.out.println("Girmek istediginiz ismi yaziniz");
				String isim=scan.nextLine();
				String isimDuzenlenmis = isim.substring(0,1).toUpperCase() + // ilk harfi buyuk olarak verir
						 isim.substring(1).replaceAll("\\w", "*"); // ilk harften 
						// sonraki tum harfleri *'a cevirir
				System.out.println(isimDuzenlenmis);




				
			}
		
		}