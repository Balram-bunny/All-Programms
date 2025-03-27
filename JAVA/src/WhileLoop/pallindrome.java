package WhileLoop;

public class pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=123;
		int rev=0;
		int remainder;
		while(a>0)
		{
			remainder=a%10;//3
			rev=rev*10 +remainder;
			a=a/10;//12;
			
		}
		System.out.println(rev);

	}

}
