package Abstraction;

public class p2 extends p1 {
 p2()
 {
	 // default super method calling super constructor
	 System.out.println(" i am child class constructor");
 }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 p=new p2();
		p.m1();
		p.m2();
		p.m3();
		p.m4();
		

	}

	@Override
	
	void m1() {
		// TODO Auto-generated method stub
		System.out.println("from m1");
		
	}

	@Override
	void m2() {
		// TODO Auto-generated method stub
		System.out.println("from m2");
		
	}

	@Override
	void m3() {
		// TODO Auto-generated method stub
		System.out.println("from m3");
		
	}

	
	

}
