package ArrayProblems;

public class searchelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30};
		int search=10;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==search)
			{
				count++;
				}
			
			}
			
		if(count>0) {
		System.out.println("Item found");}
		else
		{
			
			System.out.println("Item not found");
		}

	}

}
