package Introduction;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1900;
		String check;
		check= ((a%4 ==0 && a%100!=0)|| a%400==0)? ( a+"is a leap year") :(a+": is not a leap year");
		System.out.println(check);

	}

}
