package Projects_02__;

import java.util.Scanner;

public class arrayContains {

    /* Hakan Hocam
     * 
         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
         dış ve iç,
         içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
         İlk arrayin ikinci arrayi içerdiğini doğrulayın.
         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] arr = myStr.split(" ");
        int[] myArr = new int[5];
        for(int i = 0 ; i< arr.length ; i++){
            int num = Integer.parseInt(arr[i]);
            myArr[i] = num;
        }

        int[] UseThisArray1 = new int[3];
        int[] UseThisArray2 = new int[2];

        for(int i = 0 ; i <3 ; i++){
            UseThisArray1[i] = myArr[i];
        }

        for(int i = 3 ; i <5 ; i++){
            UseThisArray2[i-3] = myArr[i];
        }


//        Koda burdan başla
//        UseThisArray1 ve UseThisArray2 array isimlerini kullan
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        boolean b1 = false;

        for(int i = 0 ; i<UseThisArray2.length ; i++) {
            for (int j = 0; j < UseThisArray1.length; j++) {


                if (UseThisArray1[j] == UseThisArray2[i]) {
                    b1 = true;
                    break;

                } else if (UseThisArray1[j] != UseThisArray2[i] ) {
                    b1 = false;

                }
            }
        }

        System.out.println(b1);



scan.close();

    }
}