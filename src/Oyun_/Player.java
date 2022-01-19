package Oyun_;

import java.util.Scanner;

public class Player {

    protected String isim,kIsim;
    protected int can,para, hasar, saglik;
    Envanter env;
    Scanner scan =new Scanner(System.in);

    public Player(String isim) {
        this.isim = isim;
        this.env = new Envanter();
    }

    public void karakterSec(){

        switch (karMenu()) {

            case 1:
                olstrPlayer("Samuray", 5, 10, 100);
                break;

            case 2:
                olstrPlayer("Okçu", 8, 12,120);
                break;

            case 3:
                olstrPlayer("�?övalye", 7, 20,70);
                break;

            default:
                olstrPlayer("Samuray", 5, 10, 100);
                break;
        }

        System.out.println("Karakter olusturuldu ! " + "\nSeçilen Karakter : " + getkIsim());


        }

        public int karMenu(){
            System.out.println("Bir karakter seçiniz !");
            System.out.println("1- Samuray");
            System.out.println("2- Okçu");
            System.out.println("3- �?övalye");


            System.out.println("Karakter Seçiminiz :");
            int karId = scan.nextInt();

            while (karId <1 || karId >3){
                System.out.println("Lütfen geçerli bir karakter numarası giriniz zahmet olmazsa ..!");
                karId = scan.nextInt();
            }

            return karId;
        }

        public void olstrPlayer(String kIsim, int hasar, int saglik, int para ){
        setkIsim(kIsim);
        setHasar(hasar);
        setSaglik(saglik);
        setPara(para);
        setCan(saglik);

        }

        public int getTotalHasar(){
        return this.getHasar()+this.getEnv().getHasar();
        }




    public String getIsim() {
        return isim;
    }

    public String getkIsim() {
        return kIsim;
    }

    public int getCan() {
        return can;
    }

    public int getPara() {
        return para;
    }

    public int getHasar() {
        return hasar;
    }

    public int getSaglik() {
        return saglik;
    }

    public Envanter getEnv() {
        return env;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setkIsim(String kIsim) {
        this.kIsim = kIsim;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public void setPara(int para) {
        this.para = para;
    }

    public void setHasar(int hasar) {
        this.hasar = hasar;
    }

    public void setSaglik(int saglik) {
        this.saglik = saglik;
    }

    public void setEnv(Envanter env) {
        this.env = env;
    }
}




