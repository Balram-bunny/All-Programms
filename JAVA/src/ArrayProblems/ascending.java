package ArrayProblems;

public class ascending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {12,10,10,4,2};
		int temp;
		for(int i=0;i<5;i++)
		{
			for(int j=i+1;j<5;j++)
			{
				if(a[i]>a[j]) {
				temp=a[i];//12
				a[i]=a[j];//10
				a[j]=temp;//12
				}
				
				
			}
			System.out.println(a[i]);

		}

	}

}
