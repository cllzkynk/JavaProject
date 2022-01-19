package KutuphaneProject_;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		KitapIslemleri kitapIslemleri =new KitapIslemleri();
		
		while (true) {
			
			System.out.println("Hangi islemi gerceklestirmek istersiniz? \n1-) Kitap Ekle \n2-) Kitap Sil "
					+ "\n3-) Kitap Guncelle \n4-)Tum Kitaplari Goruntule \n5-)Programi Sonlandir");
			int cevap = input.nextInt();
			input.nextLine();
		
			
			if(cevap==1) {
				System.out.println("Kitap ismini giriniz");
				String kitapAdi=input.nextLine();
				System.out.println("Kitap ISBN no giriniz");
				String kitapIsbn = input.nextLine();
				System.out.println("Kitap aciklamasini giriniz");
				String kitapAciklama =input.nextLine();				
				System.out.println("Yazar ismini giriniz");
				String yazarAdi=input.nextLine();
				System.out.println("Yazar yasini giriniz");
				int yas =input.nextInt();
				System.out.println("Yazar memleketini giriniz");
				String yazarMemleketi = input.nextLine();
				input.nextLine();
				System.out.println("Yayinevi ismini giriniz");
				String yayineviAdi=input.nextLine();
				System.out.println("Yayinevi adresini giriniz");
				String yayineviAdresi=input.nextLine();				
				Yazar yazar =new Yazar(yazarAdi,yas,yazarMemleketi);
				YayinEvi yayinevi =new YayinEvi(yayineviAdi,yayineviAdresi);
				Kitap kitap =new Kitap(kitapAdi,kitapIsbn,yazar,yayinevi,kitapAciklama);
				
				kitapIslemleri.kitapEkle(kitap);
			}else if(cevap==2) {
				System.out.println("Silmek istediginiz kitap numarasini giriniz");
				int index =input.nextInt();
				kitapIslemleri.kitapSil(index);
		
			}else if(cevap==3) {
				System.out.println("Hangi kitabi Guncellemek istersiniz:");
				int index = input.nextInt();
				input.nextLine();
				System.out.println("Kitap ismini giriniz");
				String kitapAdi=input.nextLine();
				System.out.println("Kitap ISBN no giriniz");
				String kitapIsbn = input.nextLine();
				System.out.println("Kitap aciklamasini giriniz");
				String kitapAciklama =input.nextLine();				
				System.out.println("Yazar ismini giriniz");
				String yazarAdi=input.nextLine();
				System.out.println("Yazar yasini giriniz");
				int yas =input.nextInt();
				input.nextLine();
				System.out.println("Yazar memleketini giriniz");
				String yazarMemleketi = input.nextLine();
				input.nextLine();
				System.out.println("Yayinevi ismini giriniz");
				String yayineviAdi=input.nextLine();
				System.out.println("Yayinevi adresini giriniz");
				String yayineviAdresi=input.nextLine();				
				Yazar yazar =new Yazar(yazarAdi,yas,yazarMemleketi);
				YayinEvi yayinevi =new YayinEvi(yayineviAdi,yayineviAdresi);
				Kitap kitap =new Kitap(kitapAdi,kitapIsbn,yazar,yayinevi,kitapAciklama);
				
				kitapIslemleri.kitapGuncelle(index, kitap);
				
			}
			else if (cevap == 4) {
				kitapIslemleri.tumKitaplar();
			}
			else if(cevap==5) {
				System.out.println("Program sonlandirildi.");
				break;
			}
			System.out.println("________________________________________________");
			
			
		}

	}

}
