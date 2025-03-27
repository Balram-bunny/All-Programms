package Constructor;

public class B extends A {
   B()
   {   // here by default super keyword will call in default constructor
	   System.out.println(" I am from sub class constructor");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
System.out.println(b.a);		

	}

}
