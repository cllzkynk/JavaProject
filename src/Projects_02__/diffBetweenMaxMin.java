package Projects_02__;

import java.util.Scanner;

public class diffBetweenMaxMin {


     /* Mehmet Hocam
      * 
      Bir veya daha fazla öğe iceren int array verildiğinde, 
      arraydeki en büyük ve en küçük öğeler arasındaki farkı return edin.
      Not: the built-in    Math.min(v1, v2) ve   
      Math.max(v1, v2) methodları en küçük ve en büyük öğeleri return eder.
    bigDiff([10, 3, 5, 6]) → 10-3 result = 7
    bigDiff([7, 2, 10, 9]) → 10-2 result = 8
    bigDiff([2, 10, 7, 1]) → 10-1 result = 9
    return tipi  int dir
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] strArr = myStr.split(" ");

        int[] useThisArray = new int[strArr.length];

        for(int i = 0 ; i< strArr.length ; i++){

            int num =Integer.parseInt(strArr[i]);
            useThisArray[i] = num;

        }

  
    // Kodlamaya burdan başla.Bu satırdan önceki satırlarda hiçbirşeyi kaldırma ve degiştirme. 
    // Kullanacağın array 27.ci satırda  --> useThisArray
        
      //1.yol
      		/*Arrays.sort(useThisArray);
      		System.out.println(Arrays.toString(useThisArray));
      		System.out.println("arraydeki en büyük ve en küçük öğeler arasındaki fark :" 
      		+(useThisArray[useThisArray.length-1]-useThisArray[0]));*/
      		
      		//2.yol
      		int max=useThisArray[0];
      		
      		for (int i = 1; i < useThisArray.length; i++) {
      				 max=Math.max(max, useThisArray[i]);
      			
      		}
      		
      		int min=useThisArray[0];
      		for (int i = 1; i < useThisArray.length; i++) {
      			min=Math.min(min, useThisArray[i]);
      		}
      		System.out.println("arraydeki en büyük ve en küçük öğeler arasındaki fark : " +(max-min));
      		
      	
      		scan.close();
      	}
        
      

    }


