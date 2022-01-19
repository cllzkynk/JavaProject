package hesapMakinesiUygulamasi;

public class HesapMakinesi {
    
    double sayi1;
    double sayi2;

    public HesapMakinesi(){

    }
    public HesapMakinesi(double sayi1, double sayi2){
        this.sayi1=sayi1;
        this.sayi2=sayi2;

    }
    public double topla(){
        return sayi1+sayi2;
    }
    public double cikar(){
        return sayi1-sayi2;
    }
    public double carp(){
        return sayi1*sayi2;
    }
    public double bol(){
        return sayi1/sayi2;
    }

}