package MultipleInheritence;

public class P3 extends p2 implements p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		P3 p=new P3();
		p.m1();
		p.m2();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("from m1");
		
	}

}
