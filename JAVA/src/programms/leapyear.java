package programms;

public class leapyear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//year % 4 == 0 && year % 100 != 0 || year % 400 == 0
		String s;
		int a=1996;
		s=((a%4==0 && a%100!=0) || (a%400 ==0))? a+":leap year" : a +" : is not leap year";
		System.out.println(s);

	}

}
