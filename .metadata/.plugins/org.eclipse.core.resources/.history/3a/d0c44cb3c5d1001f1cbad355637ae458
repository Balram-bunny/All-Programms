package programms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// Character and length should be same
		String str="bored";
		String str2="robed";
		if(str.length()!=str2.length())
		{
			System.out.println("It is not an anagram");
			System.exit(0);
		}
		
		char ch1[]=str.toCharArray();
		char ch2[]=str2.toCharArray();
		
		 Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=ch2[i])
			{
				System.out.println(" given string is not anagram");
				System.exit(0);
			}
		}
		System.out.println(" Given string is anagram");


	}

}
