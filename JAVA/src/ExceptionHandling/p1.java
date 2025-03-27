package ExceptionHandling;

public class p1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		a=10;
		b=20;
		System.out.println("Program start");
		
		try
		{
			c=a/b;
			System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("Program end");

	}

}
