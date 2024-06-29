package array.com;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = {2,1,3,5,4};
		
		Arrays.sort(ar);
		Collections.reverse(Arrays.asList(ar));
		
		for(int num : ar) {
			System.out.println(num);
		}
		
		/*
		int size = ar.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(ar[i]+" Array Descending Order");
			
		} */

	}

}
