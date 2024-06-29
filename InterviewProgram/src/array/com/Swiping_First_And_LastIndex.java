package array.com;

import java.util.Arrays;

public class Swiping_First_And_LastIndex {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		int x = ar[ar.length-1];
		ar[ar.length-1] = ar[0];
		ar[0] = x;
		
		System.out.println("Swiping Last and First Index :"+Arrays.toString(ar));

	}

}
