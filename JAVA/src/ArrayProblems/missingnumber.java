package ArrayProblems;

public class missingnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=6;
		int[] a= {1,2,3,4,6};
      int sum=(n*(n+1))/2;// 
      int sum1=0;
      for(int i=0;i<a.length;i++)
      {
    	  sum1=sum1+a[i];
      }
      int missingnumber=sum-sum1;
      System.out.println(missingnumber);
	}

}
