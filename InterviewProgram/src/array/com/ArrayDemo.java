package array.com;

public class ArrayDemo {

	public static void main(String[] args) {
		int ar[] = {1,2,3,4,5,6};
		int output[] = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			output[i] = ar[(i+3) % ar.length];  // 
		}
		
		for(int num : output) {
			System.out.println(num);
		}
	}

}

//output : 456123