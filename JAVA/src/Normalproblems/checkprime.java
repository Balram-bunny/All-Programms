package Normalproblems;

public class checkprime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=15;
//		boolean prime = true;
		String str=num+" is prime";
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				str=num+" is not prime";			}
		}
		System.out.println(str);

	}

}
