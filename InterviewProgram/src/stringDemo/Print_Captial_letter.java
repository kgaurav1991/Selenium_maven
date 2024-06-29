package stringDemo;

public class Print_Captial_letter {

	public static void main(String[] args) {
		String s = "This is Gaurav";
		
		
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if(Character.isUpperCase(ch))
				System.out.println(ch);
			else if(Character.isLowerCase(ch))
				System.out.println(ch);
		}
	}

}
