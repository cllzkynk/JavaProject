package Projects_02__;

public class maxNumber {

     /* Tahir
      * 
         {{1,2,3}, {2,3,1} , {5,5,5} , {2,10,3}}
         int 2D arrayini  olustur
        2D arrayinden min ve max number print et
     */


    public static void main(String[] args) {

        int[][] i1 = new int[][]{{1,2,-3}, {2,3,1} , {5,-5,5} , {2,10,3}};

        int max = 0 ;
        for( int i = 0 ; i < i1.length ; i++){
            for(int j =0 ; j< i1[i].length ; j++){

                if(i1[i][j] > max){
                    max = i1[i][j];
                }
            }

        }

        System.out.println(max);
        
        int min = 1 ; // buraya 0 atamadim cunku en kucuk bu oldugu icin direk bunu aldi...
        for( int i = 0 ; i < i1.length ; i++){
            for(int j =0 ; j< i1[i].length ; j++){

                if(i1[i][j] < min){
                    min = i1[i][j];
                }
            }

        }

        System.out.println(min);

    }

}