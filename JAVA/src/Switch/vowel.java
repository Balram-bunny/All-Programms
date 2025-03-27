package Switch;

public class vowel {

	public static void main(String[] args) {
		// WAP to check character is vowel or consonant
		char ch = '+';
		if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
			switch (ch) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is a vowel");
				break;
			default:
				System.out.println(ch + " character is consonant");

			}
		} else {
			System.out.println("invalid alphabet");
		}
	}

}
