package mettlTesting;

interface Data{
	public void load();
}
abstract class Info {
	public abstract void load();
}

/*
public class Employee extends Info implements Data {
	public void load(); //invalid 
}
*/

/*
public class Employee implements Info extends Data {
	public void load(); //invalid 
}
*/
/*
public class Employee extends Info implements Data {
	public void load(); //invalid 
	public void Info.load();
	
	
}
public class Employee implements Info extends Data {
	public void Data.load();
	public void load(); //invalid 
	
	
}*/