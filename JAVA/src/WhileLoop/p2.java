package WhileLoop;

public class p2 {

	public static void main(String[] args) {
		// WAP to print total count the even number between 10 to 200
		int i=10;
		int count=0;
		while(i<=20)
		{
			if(i%2==0)
			{
				System.out.println(i);
				++count;
			}
			i++;
		}
		System.out.println("total count"+" "+count);

	}

}
