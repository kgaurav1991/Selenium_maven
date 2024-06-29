package array.com;

public class Array_First_Middle_Last_Values {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5};
		
		int first = ar[0];
		int last = ar[ar.length-1];
		int middle = (first + last) / 2;
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println("Array First Value :"+first+ " | Middle Valus :" +middle+ " |Last Value :" +last);
		}
	}

}
