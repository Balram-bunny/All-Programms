package Abstraction;

public class Test2 extends Test1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test2 t=new Test2();
		t.m1();
		t.m2();
		t.m3();
		t.m4();

	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("from m3");
	}

	@Override
	void m2() {
		System.out.println("from m2");
		
	}
// A ploymorphism which exist at the time of execution of program is called run-time ploymorphism.
	//Whenevr we writing method in such a way that method name and parameter  must be same called method overriding.
}
