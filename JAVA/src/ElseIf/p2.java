package ElseIf;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=31344311;
		int b=312;
		int c=33333;
		int d=1000;
		
		if (a>b && a>c && a>d)
		{
			System.out.println(a);
		}
		else if (b>c && b>a && b>d)
		{
			System.out.println(b);
		}
		else if (c>d && c>b && c>a)
		{
			System.out.println(c);
		}
		
		else
		{
			System.out.println(d);
		}

	}

}
