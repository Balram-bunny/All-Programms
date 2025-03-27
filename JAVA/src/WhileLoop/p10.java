


package WhileLoop;

public class p10 {

	public static void main(String[] args) {
		// WAP to print fibonacci of upto 10 numbers
		int num=10;
		int a=0;
		int b=1;
		int c;
		int i=1;
		while(i<=num)
		{
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
			i++;
		}
		System.out.println(a);
	}

}
