package mettlTesting;


interface Foo{ int bar();}
public class Sprite {
	public int fubar (Foo foo) {return foo.bar();}
	public void testFoo() {
		fubar(
				//Foo{public int bar() {return 1;}}  // invalid
				// new Foo{public int bar() {return 1;}} //invalid
				new Foo(){public int bar() {return 1;}}  // valid
				//new class Foo{public int bar() {return 1;}} // invalid
				
				);
	}

}
