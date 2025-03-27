package Constructor;

public class p2 {
	 p2()
	 {    
		 this(10);
		 System.out.println("0 arguments");		
	 }
	 p2(int a)
	 {
		 this(10,20);
		 System.out.println("1 arguments");
	 }
	 p2(int a, int b)
	 {
		 System.out.println("2 arguments");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 p=new p2();
		

	}

}
