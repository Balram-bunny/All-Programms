package ArrayProblems;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {2,3,5,9,1}; // 
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
		

	}
}


