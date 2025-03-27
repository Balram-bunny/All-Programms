package Introduction;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b= a++ + a++ + --a + a--;// = 10 +11 +11+11
		System.out.println(b);
		System.out.println(a);

	}

}
