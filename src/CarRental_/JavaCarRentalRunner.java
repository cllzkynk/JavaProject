package CarRental_;


import java.util.Scanner;


public class JavaCarRentalRunner {
	
	
	static Scanner scan = new Scanner (System.in);
	public static void main(String[] args) {
		String marka="";
		String model="";
		int aracYili = 0;
		int fiyat=0;;
		System.out.println("Aracinizi şimdiden kiralayin, tatilinizde sinirsiz ozgurluğun ve avantajli kampanyalarin keyfini surun.");
		System.out.println("        _______\r\n"
				+ "       //  ||\\ \\\r\n"
				+ " _____//___||_\\ \\___\r\n"
				+ " )  _          _    \\\r\n"
				+ " |_/ \\________/ \\___|\r\n"
				+ "___\\_/________\\_/______");
		System.out.println("---------------------------------------------------------------------------------------------------------\n\n");
		System.out.println("Java arac kiralama'ya hos geldiniz, lutfen size uyan secenegi giriniz...\n1-Admin girisi\n2-Musteri\n3-Cikis\n");
		int secim = scan.nextInt();
		
		while (secim!=3) {
			
			if (secim == 1) {
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				System.out.println("Admin panelindesiniz !");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
				System.out.println("Lutfen yapmak istediginiz islemi secin...\n1-Arac ekleme\n2-Musteri girisi\n3-Cikis\n\n");
				secim = scan.nextInt();
				scan.nextLine();
				if (secim == 1) {
					System.out.println("Lutfen aracin markasini giriniz...");
					marka = scan.nextLine();
					
					System.out.println("Lutfen aracin modelini giriniz...");
					model = scan.nextLine();
				
					System.out.println("Lutfen aracin uretim yilini giriniz...");
					aracYili = scan.nextInt();
					
					System.out.println("Lutfen arac icin belirlediginiz gunluk fiyati giriniz...");
					fiyat = scan.nextInt();
					JavaCarRental car = new JavaCarRental(marka, model, aracYili, fiyat);
					
				}
				}else if(secim == 2) {
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println("Tekrardan sitemize hosgeldiniz !");
					System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\n");
					System.out.println("Lutfen yapmak istediginiz islemi secin...\n1-Admin paneline giris\n2-Araclara goz atma\n3-Cikis\n\n");
					secim = scan.nextInt();
					scan.nextLine();
					if (secim == 2) {
						if(aracYili==0) {
							System.out.println("Maalesef elimizde arac kalmamistir");
						}else {
						System.out.println("Araclarimiz bu sekildedir-->");
						System.out.println("Aracin markasi --> "+marka+"\nAracin modeli --> "+model+"\nAracin uretim yili --> "+aracYili+"\nAracin gunluk fiyati --> $"+fiyat);
						}
						
					}
			}
			
		}
		
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

	}
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	

