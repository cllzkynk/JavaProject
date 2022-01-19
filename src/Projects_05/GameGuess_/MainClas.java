package Projects_05.GameGuess_;

public class MainClas {

    /*
        Main methodunda
     ilk olarak randomGenerator method undan random sayilari alin...
     Sonra LetsGuess method unu olusturun. 
     randomGenerator num LetsGuess method unun parametresidir

     */


    public static void main(String[] args) {

    	 
  		
  		GuessGame obj = new GuessGame();//4. adim
  		
  		obj.LetsGuess(obj.randomGenerator());//5.adim

    }

}
