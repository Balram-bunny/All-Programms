package StringProblems;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TO check anagram ,
//		  1. First convert string to array (Why we convert string to array:because, we have to apply sorting, that is possible in array)
//		  2. sort the array in ascending order
//		  3. Length and character should be same 
//		String s1="robed";
//		String s2="borrd";
//		char c1[]=s1.toCharArray();
//		char c2[]=s2.toCharArray();
//		
//	if (c1.length!=c2.length)
//	{
//		System.out.println("Given string is not anagram");
//		System.exit(0);
//	}
//	Arrays.sort(c1);
//	Arrays.sort(c2);
//   
//	for(int i=0;i<c1.length;i++)
//	{
//		if(c1[i]!=c2[i])
//		{
//			System.out.println("Given string is not anagram");
//			System.exit(0);
//		}
//	}
//	System.out.println("Given string is Anagram");
//	
		 String a="robed";
	      String b="bored";
	      
	     
	      if(a.length()!=b.length())
	      {
	        System.out.println("Given string is not anagram");
	                      System.exit(0);

	      }
	      
	      char ch1[]= a.toCharArray();
          char ch2[]= b.toCharArray();
	          
	          Arrays.sort(ch1);
	          Arrays.sort(ch2);
	          
	          for(int i=0;i<ch1.length;i++)
	          {
	            if(ch1[i]!=ch2[i])
	            {
	              System.out.println("given string is not anagram");
	              System.exit(0);
	            }
	          }
	          System.out.println("Given string is pallindrome");


	}

}
