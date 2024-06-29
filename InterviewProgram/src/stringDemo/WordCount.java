package stringDemo;

public class WordCount {

	public static void main(String[] args) {
		String s = "Welcome to India";
		char ch[] = s.toCharArray();
		
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if(ch[i] == 32) {
				count++;
				//break;
			}
			//System.out.println(s.charAt(i)+ " --Word Count in String : "+count);
		}
		System.out.println("Word Count in String : "+count);
	}

}
