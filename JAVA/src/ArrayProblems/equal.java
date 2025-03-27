package ArrayProblems;

import java.util.Arrays;

public class equal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};

	if(a==b)// = operator check the ref variable
	{
		System.out.println("both r equal");
	}
	else
	{
		System.out.println("both r not equal");
	}
		
		int c[]= {10,20,30,40,50};

		int d[]= {10,20,30,40,50};
		
		if(Arrays.equals(c, d))// Equal methods check the value in it
		{
			System.out.println("both r equal");
		}
		else
		{
			System.out.println("both r not equal");
		}


	}

}
