package Constructor;

public class sub extends Super {
	sub()
	{
		System.out.println(" I am sub class constructor");
	}
	void m1()
	{
		super.m1();
		System.out.println(" I am sub class method");
		System.out.println(super.a);
	}
	int a=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sub sc=new sub();
		sc.m1();
		System.out.println(sc.a);
		

	}

}
