package Methods;

public class MethodOverloading {
	public static void m1()
	{
		System.out.println("from m1");
	}
	public static void m1(int a)
	{
		System.out.println("from m2");
	}
	public static void m1(int a, int b)
	{
		System.out.println("from m3");
	}
      
	public static void main(String[] args) {
		// In a class having, more than one method, Condition: same method name but different formal arguments
		MethodOverloading.m1();// m1(); classname.method name we can call
		m1(10);
		m1(10,20);

	}

}
