package StringProblems;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abcdba";
		int i=0; int j=str.length()-1;
		while(i<j)
		{
			if(str.charAt(i)!=str.charAt(j))
			{
				System.out.println("given string is not pallindrome");
				System.exit(0);
			}
			i++;
			j--;
		}
		System.out.println("Given String is pallindrome");

	}

}
