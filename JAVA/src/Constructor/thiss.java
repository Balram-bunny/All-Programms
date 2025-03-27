package Constructor;
//this keyword refer to current object inside the method or constructor
public class thiss {
	thiss()
        {
        	System.out.println("I am a default constructor");
        }
	thiss(int a)
	{
		this();// This keyword also used to call its default constructor
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiss t=new thiss(100);
		

	}

}
