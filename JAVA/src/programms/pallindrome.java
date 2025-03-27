package programms;

public class pallindrome {

	public static void main(String[] args) {
		// int a=123;    ans. =321;
		int num=123;
		int rev=0;
		int remainder;
		
	while(num!=0)
	{
		remainder=num%10;
		rev=rev*10+remainder;
		num=num/10;
	}
		System.out.println(rev);

	}

}
