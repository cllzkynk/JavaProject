package Projects_05.GameGuess_;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

	Scanner scan = new Scanner(System.in);// 3. adim

	/*
	 * randomGenerator () methodunu olusturalim. Bu method 0 ile 100 arasinda random
	 * bir sayi olusturmali. Bu method random sayiyi return etmeli. Return turu int
	 * olmali...
	 */

	public int randomGenerator() {// 1. adim
		Random random = new Random();
		int sayi = random.nextInt(101);

		return sayi;

	}
	
	/*
	 * LetsGuess () methodunu olusturalim. Bu method parametre olarak bir int
	 * almali. Return type void olsun. Bu method da, dogru sayaci tahmin edene kadar
	 * sayilari tahmin etmeye devam etmelisiniz. Numaraniz random sayidan kucukse
	 * "Your number is too low" yazdiralim. Numaraniz random sayidan buyukse
	 * "Your number is too high" yazdiralim. Tahmin numaraniz random sayiiya esit
	 * oldugunda "You got it !!" yazdiralim Ve execution durdurun. Tahmin
	 * girisiiminiz maksimum 5'tir. Eğer tahmininiz 5'e ulsirsa
	 * "Anlamadim dostum !!!"
	 * 
	 * Not: 1) Sayilari tahmin ederken Scanner Class kullanmaniz gerekir. 2) Bu
	 * methodlarin her ikisi de statik bir method degildir
	 */

	public void LetsGuess(int tahmin1) {// 2/ adim
		int asilSayi = randomGenerator();

		for (int i = 1; i <= 6; i++) {
			if (i == 6) {
				System.out.println("Anlamadim dostum !!!");
				break;
			}
			System.out.print(" 0 ile 100 arasinda bir sayi tahmin ediniz\n " + i + ". tahmininiz : ");
			int tahmin = scan.nextInt();

			if (tahmin < asilSayi) {
				System.out.println("Your number is too low");
			} else if (tahmin > asilSayi) {
				System.out.println("Your number is too high");
			} else {
				System.out.println("You got it !!!");
				break;
			}
		}

		scan.close();
	}

	

}
