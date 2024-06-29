package basic.com;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String st = "My Name Is Kumar";
		int size = st.length();
		
		while(size > 0) {
			System.out.print(st.charAt(size-1));
			size--;
		}
	}

}
