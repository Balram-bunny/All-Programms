package ArrayProblems;

public class average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,13,33,32,31};
		int sum=0;
		double avg;
		int b=a.length;
		for(int i=0;i<3;i++)
		{
			sum=sum+a[i];
		}
		avg=sum/b;
		System.out.println(avg);

	}

}
