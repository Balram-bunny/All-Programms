package Sign_convention;

public class p2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1700;
		//int b=((a%4==0 )&& (a%100==0 )&& (a%400==0))? (a):( " is not a leap year");
		if (a%4==0 && a%100==0 && a%400==0)
		{
			
			
				System.out.println(a+" "+ "is aleap year");
			
		}
		
		System.out.println(a+" "+" is not a leap year");
		

	}

}
