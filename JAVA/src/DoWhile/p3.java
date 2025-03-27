package DoWhile;

public class p3 {

	public static void main(String[] args) {
		// WAP to print number from 20 to 79 ending with 4 or 8
		
		int a=20;
		do
		{
			if(a%10==4 || a%10==8)
			{
				System.out.println(a);
			}
			a++;
		}
		while(a<=79);

	}

}
