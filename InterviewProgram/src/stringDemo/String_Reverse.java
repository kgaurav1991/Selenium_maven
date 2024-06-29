package stringDemo;

class Reverse {
	void reverse() {
		String ss = "Welcome To India";
		char ch[] = ss.toCharArray();

		for (int i = ch.length-1; i > 0; i--) {
			System.out.print(ch[i]);
		}
	}
}

class ReverseDemo {
	void reverseDemo() {
		String s = "My Name is Kumar";
		int size = s.length();

		while (size > 0) {
			System.out.print(s.charAt(size - 1));
			size--;
		}
	}
}

public class String_Reverse {

	public static void main(String[] args) {
		System.out.println("String Reverse Print :");
		Reverse r = new Reverse();
		r.reverse();
		System.out.println();
		ReverseDemo rr = new ReverseDemo();
		rr.reverseDemo();

	}

}

// output : ramuK si emaN yM
