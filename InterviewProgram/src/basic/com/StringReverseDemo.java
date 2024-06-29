package basic.com;

public class StringReverseDemo {

	public static void main(String[] args) {
		String s = "My Name is Kumar";
		int size = s.length();
		
		while(size > 0) {
			System.out.print(s.charAt(size-1));
			size--;
		}

	}

}
