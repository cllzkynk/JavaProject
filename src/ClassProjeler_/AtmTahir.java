package ClassProjeler_;

import java.util.Scanner;

public class AtmTahir {

    static Scanner scan = new Scanner(System.in);
    String kartNo = "1234567812345678";
    int sifre = 1234;
    static int bakiye = 10000;
    String hesapNo = "98765432";


    public static void main(String[] args) {

        System.out.println("~~~~~~~~~~~Java Banka Hosgeldiniz~~~~~~~~~~~");
        int kontrol = 0;
        do {
            System.out.println("Lutfen kart numarasini giriniz : ");
            String kartNo = scan.nextLine();

            if (kartNo.contains("1234567812345678") || kartNo.contains("1234123412341234") || kartNo.contains("2222222222222222") ) {
                System.out.println("Isleminiz Basariyla gerceklestirildi...");
                kontrol = 1;
            } else
                System.out.println("Hatali Tuslama! Lutfen tekrar deneyiniz : ");

        } while (kontrol == 0);


        int kontrol1=0;
        do {
            System.out.println("Lutfen Kart Sifrenizi giriniz : ");
            int sifre = scan.nextInt();

            if (sifre==1234 || sifre==1453 || sifre==1071) {
                System.out.println("Isleminiz Basariyla gerceklestirildi...");
                kontrol1 = 1;
            } else
                System.out.println("Hatali Tuslama! Lutfen tekrar deneyiniz : ");

        } while (kontrol1 == 0);


        menu();

        scan.close();

    }


    public static void menu() {

        System.out.println("****************************************");
        scan.nextLine();
        boolean cikilsinMi=false;
        while(!cikilsinMi){
        System.out.println("Lutfen yapmak istediginiz islemi tuslayiniz...\n1-Para Cekme\n2-Para Yatirma\n3-Para Gonderme\n" +
                "4-Sifre Degistirme\n5-Bakiye\n6-Cikis");
        String islem = scan.nextLine();

        switch (islem){
            case "1" :
                paraCekme();
                break;
            case "2" :
                paraYatirma();
                break;
            case "3" :
                paraGonderme();
                break;
            case "4" :
                sifreDegistirme();
                break;
            case "5" :
                bakiye();
                break;
            case "6" :
                System.out.println("Cikis yapiliyor... Hayirli Gunler");
                cikilsinMi=true;
                break;
            default :
                System.out.println("Uygun bir islem secmediniz");
                break;
        }


    }



    }

    public static void bakiye() {
        System.out.println("Bakiyeniz : " + bakiye);
        System.out.println("**************************************************\n");
    }

    public static void sifreDegistirme() {

        int kontrol = 0;
        do {
            System.out.println("Lutfen degistirmek istediginiz sifreyi giriniz : ");
            int sifre = scan.nextInt();
            System.out.println("Lutfen yeni sifrenizi giriniz : ");
            int yeniSifre = scan.nextInt();
            scan.nextLine();

            if (sifre != yeniSifre) {
                System.out.println(" Isleminiz basariyla gerceklestirildi...");
                System.out.println("**************************************************\n");
                kontrol = 1;
            } else
                System.out.println(" Isleminiz gerceklesmedi...Tekrar deneyiniz...");
            System.out.println("**************************************************\n");

        } while (kontrol == 0);
    }

    private static void paraGonderme() {

        int kontrol=0;
        do {
        System.out.println("Para gondereceginiz Hesap Numarasini giriniz :");
        String hesapNo = scan.nextLine();

        if (hesapNo.contains("98765432") || hesapNo.contains("12345678") || hesapNo.contains("85207410")){
            System.out.println("Hesap numarasi onayladi...\nGondermek istediginiz miktari giriniz : ");
            double havaleTutari= scan.nextDouble();
            scan.nextLine();
            if (bakiye>= havaleTutari) {
                bakiye-=havaleTutari;
                System.out.println("Islem tamamlandi !");
                System.out.println("**************************************************\n");
            }else {
                System.out.println("Yetersiz bakiye ! :(");
                System.out.println("**************************************************\n");
            }
            kontrol = 1;
        } else
            System.out.println("Hatali Tuslama! Lutfen tekrar deneyiniz : ");

    } while (kontrol == 0);
        }


    private static void paraYatirma() {
        System.out.println("Lutfen yatirmak istediginiz miktari giriniz : ");
        int yatirilanMiktar= scan.nextInt();
        bakiye+=yatirilanMiktar;
        System.out.println(" Isleminiz basariyla gerceklestirildi...\nBakiyeniz : " + bakiye);
        System.out.println("**************************************************\n");
        scan.nextLine();
    }

    private static void paraCekme() {
        System.out.println("Lutfen cekmek istediginiz miktari giriniz : ");
        int cekilenMiktar= scan.nextInt();
        bakiye-=cekilenMiktar;
        System.out.println(" Isleminiz basariyla gerceklestirildi...\nBakiyeniz : " + bakiye);
        System.out.println("**************************************************\n");
        scan.nextLine();
    }


}