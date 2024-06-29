package array.com;

import java.util.Arrays;

public class AssendingOrder {

	public static void main(String[] args) {
		int ar[] = {2,1,5,4,3};
		
		Arrays.sort(ar);
		
		for(int num : ar) {
			System.out.println(num);
		}
		
		/*
		int size = ar.length;
		
		for (int i = 0; i < size; i++) {
			for (int j = i+1; j < size; j++) {
				if(ar[i] > ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
			System.out.println(ar[i]+" Array Assending Order");
			
		} */

	}

}
