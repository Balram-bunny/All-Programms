package WhileLoop;

public class p5 {

	public static void main(String[] args) {
		// WAP to reverse of any number
		int a=15;
		int rev=0;
		int remainder;
		while(a!=0)
		{
			remainder=a%10;
			rev=rev*10+ remainder;
			a=a/10;
		}
		System.out.println(rev);
	}

}
