package mayin_;
import java.util.Random;
import java.util.Scanner;

public class mayinTarlasi {
    public static int[][] RastgeleDoldur(int a, int b) {
        Random rd = new Random();
        int[][] matris = new int[a][b];
        int i = 0;
        while (i < a) {
            int j = 0;
            while (j < b) {
                matris[i][j] = rd.nextInt(2);
                j++;
            }
            i++;
        }

        for (int k = 0; k < a; k++) {
            for (int l = 0; l < b; l++) {
                System.out.print(matris[k][l] + " ");
            }
            System.out.println();
        }

        return matris;

    }

    static String oyuncu;
    static String oyuncu1;
    static String oyuncu2;
    static int puan1;
    static int puan2;

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        System.out.println("1 oyuncunun ismi ");
        oyuncu1 = scan.nextLine();
        oyuncu = oyuncu1; // ali
        System.out.println("2 oyuncunun ismi ");
        oyuncu2 = scan.nextLine();


        System.out.println("Zorluk derecesini Seciniz 1 en kolay 4 en zor");
        int a = 0;
        int b = 0;

        int zorluk = scan.nextInt();
        switch (zorluk) {
            case 1:
                a = 5;
                b = 5;
                break;
            case 2:

                a = 10;
                b = 10;
                break;
            case 3:
                a = 15;
                b = 15;
                break;
            case 4:
                a = 20;
                b = 20;
                break;
        }

        // 1 mayin var
        // 0 temiz mayin yok
        int[][] oyunMatrisi = RastgeleDoldur(a, b);

        boolean kontrol = true;
        while (kontrol) {
            System.out.println("Oyuncu  : " + oyuncu);
            System.out.println("satiri sec");
            int x = scan.nextInt();
            System.out.println("Sutunu sec");
            int y = scan.nextInt();
            if (oyunMatrisi[x][y] == 1) {
                System.out.println("Guuummmmmmmm");
                System.out.println("Oyun bitti\n" + oyuncu1 + " puani " + puan1 + "\n" + oyuncu2 + " puani " + puan2);
                kontrol = false;

            } else {
                if (oyuncu.equals(oyuncu1)) {
                    puan1 += 10;
                } else {
                    puan2 += 10;
                }

                System.out.println("Hala hayattasin Devammm");
                System.out.println(oyuncu1 + " puani " + puan1 + "\n" + oyuncu2 + " puani " + puan2);
                elgecme();
            }

        }


        for (int[] ints : oyunMatrisi) {
            for (int l = 0; l < oyunMatrisi.length; l++) {
                System.out.print(ints[l] + " ");
            }
            System.out.println();
        }


    }

    public static void elgecme() {
        if (oyuncu.equals(oyuncu1)) {
            oyuncu = oyuncu2;

        } else {
            oyuncu = oyuncu1;

        }

    }
}
