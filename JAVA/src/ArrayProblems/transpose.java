package ArrayProblems;

public class transpose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [2][2];// row should be column & column should be row
		a[0][0]=1; a[0][1]=2; 
		a[1][0]=4; a[1][1]=5; 
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{				System.out.print(a[i][j]+" ");
			}
			System.out.println("\t");
		}
		System.out.println("-----------------");
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{	
				System.out.print(a[j][i]+" ");
			
			}
			System.out.println("\t");
		}

	}

}
