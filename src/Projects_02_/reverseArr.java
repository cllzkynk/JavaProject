package Projects_02_;

import java.util.Arrays;
import java.util.Collections;

public class reverseArr {

	/*
	 * Basri hocam
	 * 
	 * Verilen String array String arrayi ters cevir ters arrayi yazdir
	 * 
	 * NOT: Arrays.toString(your_array_name); <--- kullanin
	 */

	/*
	 * public static void main(String[] args) {
	 * 
	 * Scanner scan = new Scanner(System.in);
	 * 
	 * String myStr = scan.nextLine();
	 * 
	 * String[] useThisArray = myStr.split(" ");
	 */

	// Koda burdan baslayin

	/* String Array i tersten ceviren program */

	public static void main(String[] args) {
		String[] myArray = { "one", "Two", "Three", "Four", "Five", "Six", "Seven", "Nine" };
		System.out.println("Original Array:" + Arrays.asList(myArray));

		Collections.reverse(null);

		reverse(myArray);

	}

	static void reverse(String myArray[]) {
		Collections.reverse(Arrays.asList(myArray));
		System.out.println("Reversed Array:" + Arrays.asList(myArray));
	}

}
/*
 *
 * String[] reversed = new String[useThisArray.length];
 *
 * int counter = 0 ;
 *
 * for(int i = useThisArray.length-1 ; i >=0 ; i--){
 *
 * reversed[counter++] = useThisArray[i];
 *
 * }
 *
 *
 * System.out.println(Arrays.toString(reversed));
 */


