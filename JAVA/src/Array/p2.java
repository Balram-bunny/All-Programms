package Array;

public class p2 {

	public static void main(String[] args) {
		// WAP to print  last 10 even numbeir from 100 to 170 ending with 4 and 8 stored them in array
		int a[]=new int[10];
		int value=170;
		for(int i=0;i<a.length && value>=100;value--)
		{
			if(i%2==0 && (i%10==4 || i%10==8))

		{
			a[i]=value;
			i++;
		}
		
		

	}
		for(int i=0; i<a.length;i++)
		{
			System.out.println(a[i]+ " ");
		}

}
}
