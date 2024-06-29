package commandLine;

public class CommandLine {

	public static void main(String[] args) {
		
		System.out.println("Hello !!! Welcome To " +args[1]+ "Session");
		
		CommandLine cl = new CommandLine();
		System.out.println(cl.sayHello(args[0]));
		

	}
	public String sayHello(String name) {
		return name;
	}

}
