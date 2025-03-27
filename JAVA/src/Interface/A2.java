package Interface;

public class A2 implements A1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A2 a=new A2();
		a.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println(A1.a);
		
	}

}
