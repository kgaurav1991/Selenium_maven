package mettlTesting;


interface Declarestuff{
public static final int EASY = 3;
void doStuff(int t);

}

public class TestDeclare implements Declarestuff {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		new TestDeclare().doStuff(++x);
		

	}
	public void doStuff(int s) {   
		s += EASY + ++s;
		System.out.println("s" +s); // s16
}



}
