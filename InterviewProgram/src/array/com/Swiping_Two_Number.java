package array.com;

import java.util.Arrays;

public class Swiping_Two_Number {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		int x = ar[2];
		ar[2] = ar[ar.length-1];
		ar[ar.length-1] = x;
		
		System.out.println("Swaping Second & Last Indax :" +Arrays.toString(ar));

	}

}
