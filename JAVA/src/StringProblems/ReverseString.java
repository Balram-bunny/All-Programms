package StringProblems;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="MOM";// size=6 but, indexing will be 0,1,2,3,4,5
	String rev="";
	int count=0;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+ name.charAt(i);
			count++;

		}
		System.out.println(rev);
		System.out.println(count);
		
		


	}

}
