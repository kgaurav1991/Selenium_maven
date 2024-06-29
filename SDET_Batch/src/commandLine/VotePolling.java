package commandLine;

public class VotePolling {

	public static void main(String[] args) {
		int age;
		age = Integer.parseInt(args[0]);
		
		if(age >= 18)
			System.out.println(age+" : years is eligible to vote polling in India " );
		else
			System.out.println(age+ " : years is not eligible to vote polling in India " );

	}

}
