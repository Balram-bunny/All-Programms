package ArrayProblems;

public class copyarray {

	public static void main(String[] args) {
		// copy all array element to another array. for that second array data type and length should be same
		int a[]= {10,20,30};
		int b[]= new int[33];
		
		for(int i=0;i<a.length;i++)
		{
			try
			{
				b[i]=a[i];
			System.out.println(b[i]);
			}
			catch(Exception e)
			{
			System.out.println(e);}
		}

	}

}
