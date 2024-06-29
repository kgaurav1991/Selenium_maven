package mettlTesting;


public class NumberDemo {
	
	public static void parse(String str) {
		try {
			float t = Float.parseFloat(str);
		}catch(NumberFormatException nfe) {
			//f =0 ;  //invalid
			
		}finally {
			//System.out.println(f);  // compilation error
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parse("invaloid");

	}

}
