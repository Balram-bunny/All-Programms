package Array;

public class Twodimensional {
//	public void m1(int a)
//	{
//		
//	}
//	public int  m2(int b)
//	{
//		return 10;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int [2][2];
		a[0][0]=1;  a[0][1]=3;
		a[1][0]=2;  a[1][1]=5;
		 
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a.length;j++)
			{
				System.out.print(a[i][j]);
				//System.out.print(" \t");
				
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		for(int []a1:a)
		{
			for(int a2:a1)
			{
				System.out.print("\t"+a2);
			}
			System.out.println();
		}
//		Twodimensional t=new Twodimensional();
//		t.m1(10);
//		t.m2(10);
	}

}
