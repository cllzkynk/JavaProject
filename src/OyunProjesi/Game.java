package OyunProjesi;

import java.util.Scanner;

public class Game {

  Player player;

  Scanner scan = new Scanner(System.in);

  public void giris() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Şimdi oyun zamanı.....");
    System.out.print("Lütfen isminizi giriniz : ");
    String playerIsim = scan.nextLine();
    player = new Player(playerIsim);
    player.karakterSec();
    start();
  }
  public void start() {
      
  }
}
