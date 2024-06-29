package array.com;


public class AppendDemo {

	public static void main(String[] args) {
		int ar[] = {1,0,2,0,3,4,5};
		StringBuffer output = new StringBuffer();
		
		for(int num : ar) {
			if(num != 0) {
				output.append(num);
			}
		}
		int zeroNum = ar.length - output.length();
		for (int i = 0; i < zeroNum; i++) {
			output.append(0);
		}
		System.out.println(output.toString());
	}

}
