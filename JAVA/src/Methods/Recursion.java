package Methods;

public class Recursion {
   int i=0;
  void m1()
  {
	  
	  if(i<=10)
	  {
		  ++i;
		  System.out.println(i);
		  m1();
		   
	  }
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion p=new Recursion();
		p.m1();
	}

}
