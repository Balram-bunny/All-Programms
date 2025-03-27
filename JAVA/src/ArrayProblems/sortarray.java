package ArrayProblems;

import java.util.Arrays;

public class sortarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {12,10,4,3,79};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("--------------");
		int b[]=Arrays.copyOf(a, 5);// for copy an array
		for(int i=0;i<5;i++)
		{
			System.out.println(b[i]);
		}
		System.out.println("-----------");
		boolean check= Arrays.equals(a, b);
		System.out.println(check);
		

	}

}
