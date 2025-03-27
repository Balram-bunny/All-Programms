package WhileLoop;

public class p8 {

	public static void main(String[] args) {
		// WAP to print sum of even & Odd number from 1 to 200
		int i = 1;
		int oddsum = 0;
		int evensum = 0;
		int countodd = 0;
		int counteven = 0;
		while (i <= 200) {
			if (i % 2 == 0) {
				evensum = evensum + i;
				counteven++;
			} else {
				oddsum = oddsum + i;
				countodd++;

			}
			i++;
		}
		System.out.println("sum of odd number is" + " " + oddsum);
		System.out.println("sum of even number is" + " " + evensum);
		System.out.println("count of even number is " + " " + counteven);
		System.out.println("count of odd number is " + " " + countodd);

	}

}
