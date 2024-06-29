package mettlTesting;
class A{
	A(String s){
		
	}A(){
		
	}
}
public class B extends A {
	B(){}
	B(String s){
		super(s);
	}
	void test() {
		A a = new B(); // valid
		//A a = new B(5);  // invalid
		//A a = new A(String s);  // invalid 
	}
}
