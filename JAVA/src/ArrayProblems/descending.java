package ArrayProblems;

public class descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,10,10,14,2};
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
				
				
			}
			System.out.println(a[i]);

		}


	}

}
