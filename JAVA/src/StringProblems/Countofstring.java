package StringProblems;

public class Countofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name= "RAHUL BALRAM ANJALI SHIKHA";
		int count=0;
		
		for(int i=name.length()-1;i>=0;i--)
		{
			count++;
		}
		System.out.println(count);


	}

}
