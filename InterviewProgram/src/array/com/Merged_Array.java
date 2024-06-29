package array.com;

public class Merged_Array {

	public static void main(String[] args) {
		int array1[] = { 1, 2, 3 };
		int array2[] = { 4, 5 };
		int length = array1.length + array2.length;

		// Create new Array
		int mergeArray[] = new int[length];

		// Copy elements of the first array into the merged array
		for (int i = 0; i < array1.length; i++) {
			mergeArray[i] = array1[i];
		}

		// Copy elements of the second array into the merged array
		for (int i = 0; i < array2.length; i++) {
			mergeArray[array1.length + i] = array2[i];
		}
		
		  // Print the merged array
		for(int num : mergeArray) {
			System.out.println("Merged Array :"+num);
		}

	}

}
