package WhileLoop;

public class p9 {

	public static void main(String[] args) {
		// WAP to print square of the digits of a number
		 int num=12342;
		 int digit;
		 int sum=0;
		 while(num>0)
		 {
			 digit=num%10;
			int square= digit * digit;
			 System.out.println("square of "+ digit + " is "+ square);
			 sum=sum+square;
			 num=num/10;
			 
			 
		 }
		 System.out.println("sum of square is "+" " + sum);
		

	}

}
