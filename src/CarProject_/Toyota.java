package CarProject_;

public class Toyota extends Car{
	
	protected   String make = "Toyota";
    protected   String model = "Corolla";
    protected    int year = 2009;
    protected    String renk = "Beyaz";
    
    public Toyota() {
    	
    }
    public Toyota (String model , int year) {
    	this.model=model;
        this.year=year;
    }
        
    

	public static void main(String[] args) {
		 /*
	    Bir class olusturunuz adi Toyota olsun
	    icerisinde 3 instance variable olsun 
	    protected String make = "Toyota";
	    protected String model = "Corolla";
	    protected int year = 2009;
	    Sonra 3 tane String return tipinden method olusturunuz
	    arabaMarkasi
	    arabaModeli
	    arabaYili
	    Son olarak bir oject olusturup method lari main method da print ediniz 
	    */
		Toyota yeniToyota = new Toyota();
        System.out.println("Arabanin markasi: "+yeniToyota.arabaMarkasi());
        System.out.println("Arabanin modeli: "+yeniToyota.arabaModeli());
        System.out.println("Arabanin yili: "+yeniToyota.arabaYili());
        System.out.println("Arabanin renk: "+yeniToyota.arabaRengi());
        
        Toyota toyota2 = new Toyota("Avensis",2018);
        
        System.out.println("Arabanin markasi: "+toyota2.arabaMarkasi());
        System.out.println("Arabanin modeli: "+toyota2.arabaModeli());
        System.out.println("Arabanin yili: "+toyota2.arabaYili());
        
 
        
    }

    public  String arabaMarkasi() {
        
        return make;
    }
    
    public  String arabaModeli() {
        
        return model;
    }
    
    public  int arabaYili() {
        
        return year;
    }
    public  String arabaRengi() {
        
        return renk;
    
    
    
}
    }
    
