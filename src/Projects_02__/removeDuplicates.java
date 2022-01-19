package Projects_02__;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unused")
public class removeDuplicates {

	/*
	 * Merve Hocam
	 * 
	 * Verilen int array duplicated(tekrarlanan) ogeleri array den kaldir
	 * non-duplicated(tekrarlanmayan) oge sayisini print et Ornek: Array is
	 * 1,2,2,2,3,3,3,4,4,4,5,5,5 //1 2 3 4 5 result 5 olmali NOT: resultu print
	 * ederken for loop kullanmayin
	 * System.out.println(Arrays.toString(your_array_name)); kullanin
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String myStr = scan.nextLine();

		String[] arr = myStr.split(" ");

		int[] useThisArray = new int[arr.length];

		for (int i = 0; i < useThisArray.length; i++) {

			int num = Integer.parseInt(arr[i]);

			useThisArray[i] = num;

		}

		// Kodlamaya burdan ba�la.bu sat�rdan �nceki satirlarda hicbir�eyi degi�tirme.
		// useThisLine arrayini kullan

		List<Integer> arrList = new ArrayList<>();

		for (int i = 0; i < useThisArray.length; i++) {
			if (!arrList.contains(useThisArray[i])) {
				arrList.add(useThisArray[i]);
			}

		}
		System.out.println(arrList);
		System.out.println("Result : " + arrList.size());

		scan.close();
	}

}

/*
 * 
 * 
 * int n=useThisArray.length; int[]temp=new int[n]; int j=0; for (int i = 0; i
 * <n-1 ; i++) { if(useThisArray[i]!=useThisArray[i+1]){
 * temp[j++]=useThisArray[i]; }
 * 
 * } temp[j++]=useThisArray[n-1]; System.out.println(Arrays.toString(temp));
 */
