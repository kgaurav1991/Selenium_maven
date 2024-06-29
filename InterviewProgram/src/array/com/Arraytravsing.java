package array.com;

public class Arraytravsing {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6};
		int output[] = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			output[i] = ar[(i+1) % ar.length];  // (i+2) / (i+3)
		}
		 
		for(int num : output) {
			System.out.println(num);
		}
	}

}


// output : 234561