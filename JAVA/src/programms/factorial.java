package programms;

public class factorial {

	public static void main(String[] args) {
		// 3! =3*2*1
		int num=3;
		int fact=1;
		for(int  i=num;i>0;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		

	}

}
