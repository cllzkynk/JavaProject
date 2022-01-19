package ucusProjesi_;



    public class ucusBilgileri extends Musteriler {
        /*
            1-) Kullanicinin ucak bileti almasi icin once kullanicinin bir hesabi var mi yok mu kontrol ediniz
            2-) Kullaniciya tek yon mu gidis donus mu bilet almak istediginiz sorun
            3-) Kullanicinin kaydi varsa kalkis yerini, gidicegi yeri kalkis saatini ve tarihini ogrenin. Ve bilet fiyatini kullaniciya gosterin
            4-) Eğer bilet fiyati kisiye uygun gelmediyse vazgecme opsiyonu ekleyin
         */
        public void ucusTekCift() {
            System.out.println("Ucusunuzu Tek yon mu Gidis Donus mu yapmak istersiniz? Tek Yon icin 1 Gidis Donus icin 2'yi seciniz");
            int secim = scan.nextInt();
            switch (secim) {
                case 1:
                    tekYon();
                    break;
                case 2:
                    ciftYon();
                    break;
                default:
                    System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyin");
                    ucusTekCift();
            }
        }
        public void ciftYon() {
            int b = 0;
            while (b < 70) {
                double a = Math.random();
                b = (int) (a * 100);
            }
            System.out.println("Lutfen kalkis noktasi seciniz");
            String kalkis = scan.next();
            System.out.println("Lutfen inis noktasi seciniz");
            String inis = scan.next();
            System.out.println("Lutfen Gidis tarihini seciniz (yyyy/aa/gg)");
            String gidis = scan.next();
            System.out.println("Lutfen Donus tarihini seciniz (yyyy/aa/gg)");
            String donus = scan.next();
            char kalkisIlkHarf = kalkis.toUpperCase().charAt(0);
            char inisIlkHarf = inis.toUpperCase().charAt(0);
            String ucusBilgileri = kalkis + " ==> " + inis + " " + gidis + " " + donus + " " + kalkisIlkHarf +
                    inisIlkHarf + "GD" + ucusNumarasi + " Ucus nolu ucusunuz ve $" + b * 2 + " bilet fiyatiniz";
            System.out.println(ucusBilgileri + " onayliyor musunuz (E/H)");
            char secim = scan.next().charAt(0);
            if (secim == 'E') {
                System.out.println("Biletiniz onaylanmistir\n" + ucusBilgileri);
                ucusNumarasi++;
            } else {
                System.out.println("Tesekkur eder iyi gunler dileriz...");
            }
        }
        public void tekYon() {
            int b = 0;
            while (b < 70) {
                double a = Math.random();
                b = (int) (a * 100);
            }
            System.out.println("Lutfen kalkis noktasi seciniz");
            String kalkis = scan.next();
            System.out.println("Lutfen inis noktasi seciniz");
            String inis = scan.next();
            System.out.println("Lutfen Gidis tarihini seciniz (yyyy/aa/gg)");
            String gidis = scan.next();
            char kalkisIlkHarf = kalkis.toUpperCase().charAt(0);
            char inisIlkHarf = inis.toUpperCase().charAt(0);
            String ucusBilgileri = kalkis + " ==> " + inis + " " + gidis + " " + kalkisIlkHarf +
                    inisIlkHarf + "TY" + ucusNumarasi + " Ucus nolu ucusunuz ve $" + b + " bilet fiyatiniz";
            System.out.println(ucusBilgileri + " onayliyor musunuz (E/H)");
            char secim = scan.next().charAt(0);
            if (secim == 'E') {
                System.out.println("Biletiniz onaylanmistir\n" + ucusBilgileri);
                ucusNumarasi++;
            } else {
                System.out.println("Tesekkur eder iyi gunler dileriz...");
            }
        }
        public void menu() {
            kullanicilar.put("selim", "1234");
            System.out.println("Lutfen yapmak istediginiz islemi secin\n1:Hesap giris\n2:Hesap olusturma");
            int sayi = scan.nextInt();
            if(sayi==1){
                kayitVarmi();
                ucusTekCift();
            }else if(sayi == 2){
                musteriKaydi();
                menu();
            }else{
                System.out.println("Yanlis giris yaptiniz. Lutfen tekrar deneyiniz");
                menu();
            }
        }
    }

