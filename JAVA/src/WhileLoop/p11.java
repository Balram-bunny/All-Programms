package WhileLoop;

public class p11 {

	public static void main(String[] args) {
		// Factorial of a number
		int num=10;
		int fact=0;
		
		while(num!=0)
		{
			 fact=1;
			int digit=num%10;
			int i=1;
			while (i<=digit) 
			{
				fact=fact*i;
				i++;
			}
			num=num/10;
		}
		System.out.println(fact);



	
	}}


