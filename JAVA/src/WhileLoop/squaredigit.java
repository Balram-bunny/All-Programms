package WhileLoop;

public class squaredigit {

	public static void main(String[] args) {
		// 0,1,1,2,3
		int num=5;
		int fact=1;
		while(num>0)
		{
			fact=fact*num;//4
			num--;
			
		}
		System.out.println(fact);
		
		System.out.println("------------------");
		int a=4;int f=1;
		
		for(int i=a;i>0;i--)
		{
			f=f*i;
		}
		System.out.println(f);
		
		
		
		
}
}
