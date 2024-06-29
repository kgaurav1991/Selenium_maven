package stringDemo;

public class FirstPrintCaptialLetter {
		static int a = 20;
		FirstPrintCaptialLetter() {
			a++; // 21
		}
		void obj() {
			a++; // 22
			System.out.println(a); // 23
		}
		
	public static void main(String[] args) {
		FirstPrintCaptialLetter f = new FirstPrintCaptialLetter();
		FirstPrintCaptialLetter f1 = new FirstPrintCaptialLetter();
		FirstPrintCaptialLetter f2 = new FirstPrintCaptialLetter();
		
		f.obj(); // 24
		f1.obj(); //25 
		f2.obj(); // 26
		
	}

}