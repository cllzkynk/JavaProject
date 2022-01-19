package Projects_02_;

import java.util.Scanner;

public class sameFirstAndLast {

    /* Mehmet Hocam
     * 
    Bir int array verildiğinde, array uzunluğu 1 veya daha fazlaysa ve 
    ilk öğe ile son öğe eşitse true değerini yazdırın.
    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true
    sadece  true veya false print et
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

      // Koda burdan başlayin
        
        if (useThisArray.length>=1 && useThisArray[useThisArray.length-1].equals(useThisArray[0])) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
        
        
        
        
        
        
        
        
        
        scan.close();
       }


   }       
        
        
        
        
        
        
        
        
        /*

        if(useThisArray[0].equals(useThisArray[useThisArray.length-1])){
            System.out.println("true");
        }else{
            System.out.println("false");
            
            */
   


