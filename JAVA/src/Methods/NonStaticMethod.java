package Methods;

public class NonStaticMethod {
   void m1()
   {
	   System.out.println("from m1");
   }
   int m1(int a)
   {
	   return a;
   }
   String m2(String a)
   {
	   return a;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStaticMethod n=new NonStaticMethod();
		n.m1();
		System.out.println(n.m1(10));
		System.out.println(n.m2("b"));

	}

}
