package kursKayit;

import java.time.LocalDate;

public class Kurslar {
    String adi;
    LocalDate baslamaZamani;
    int kont;
    int KursSure;


    public Kurslar (){}
    public Kurslar(String adi, LocalDate baslamaZamani, int kont, int kursSure) {
        this.adi = adi;
        this.baslamaZamani = baslamaZamani;
        this.kont = kont;
        KursSure = kursSure;
    }


}
