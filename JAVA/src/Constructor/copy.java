package Constructor;

public class copy {
	int a,b;
      copy()
      {
    	  a=10; b=20;
    	  System.out.println(a +" "+  b);
      }
      copy(copy c)   // copy constructor means , whenever we pass the  obj reference to the constructor
      {
    	 a= c.a;
    	 b=c.b; 
    	 System.out.println(a+" " +b);
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		copy ref=new copy();
		copy ref2=new copy(ref);
		

	}

}
