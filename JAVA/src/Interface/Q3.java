package Interface;

public class Q3 implements Q1.Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q3 q=new Q3();
		q.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("from m1");
	}

}
