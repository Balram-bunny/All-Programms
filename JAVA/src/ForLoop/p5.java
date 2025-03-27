package ForLoop;

public class p5 {

	public static void main(String[] args) {
		// WAP to print the even no. which is divisible by 7 but not divisible by 14 from 10 to 740.
		for(int i=14;i<=740;i++)
		{
			if(i%2==0 && i%7==0 && i%14!=0)
			{
				System.out.println(i);
			}
		}

	}

}
