package StringProblems;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Balram";
		String strl="";
		
		for (int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(strl.indexOf(ch)<0)
			{
				strl=strl+ch;
			}
			
		}
		System.out.println(strl);
		
		

			

		}
	}


