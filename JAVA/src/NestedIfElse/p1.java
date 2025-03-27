package NestedIfElse;

public class p1 {

	public static void main(String[] args) {
		// Nested means one within other
		int a=210;
		int b=210;
		int c=30;
		 if (a>b)
		 {
			 if(a>c)
			 {
				 System.out.println(a);
			 }
			 else
			 {
				 System.out.println(c);
			 }
		 }
		 else
		 {
			 if(b>c)
			 {
				 System.out.println(b);
			 }
			 else
			 {
				 System.out.println(c);
			 }
		 }

	}

}
