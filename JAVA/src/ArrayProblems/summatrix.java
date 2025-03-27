package ArrayProblems;

public class summatrix {

	public static void main(String[] args) {
		// sum of two matrix
		int a[][]= {{1,2},{2,3}};
		int b[][]= {{4,5},{6,1}};
		int c[][]=new int [2][2];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println("\t");
		}
		

		

	}

}
