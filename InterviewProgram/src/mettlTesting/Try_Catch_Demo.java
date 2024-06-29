package mettlTesting;

public class Try_Catch_Demo {
	static void test() {
		try {
			String x = null;
			System.out.println(x.toString());
		}finally {
			System.out.println("Finally");
		}
	}

	public static void main(String[] args) {
		try {
			test();
		}catch(Exception e) {
			System.out.println("Exception");
		}

	}

}

// out put : Finally Exception
