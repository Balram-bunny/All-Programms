package MultipleInheritence;

public class Z1 implements Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z1 z=new Z1();
		z.m1();
		z.m2();
		z.m3();
     X.m4();
		

	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("from m2");
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("from m1");
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("from m3");
		
	}

	

}
