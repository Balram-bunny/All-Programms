package MultipleInheritence;

public class C implements A,B{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c=new C();
		c.m1();
		c.m2();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("from m1");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("from m2");
		
	}

}
