package Abstraction;

public class B extends A {
      B()
      {
    	  super(10);
    	  System.out.println("from B");
      }
      void m1()
      {
    	  System.out.println("from m1");
      }
      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.m1();
		System.out.println(b.a);

	}

}
