package Constructor;
// private constructor: when we declare private to any constructor, class or menthod we can't access that in another class we can only access in same class.

public class privatee {
	private privatee()
	{
		System.out.println("I am a privte constructor");
	}


	public static void main(String[] args) {
		privatee p=new privatee();
	}

}
