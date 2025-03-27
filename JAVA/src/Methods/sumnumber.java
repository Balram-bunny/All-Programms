package Methods;

public class sumnumber {
	int a=10;
	static int b=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumnumber.m2();
		
	}
	static void m2() {
		System.out.println("sum is:"+(a+b));// in static method, only static variable can be work
	}
	 void m1()
	{
		System.out.println("sum is:"+(a+b));// NON-static method can contain both static and non-static variable.
	}

}
