package Methods;

public class NonStaticVariable {
  int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a=20;
     System.out.println(a);
     NonStaticVariable n=new NonStaticVariable();
     System.out.println(n.a);
	}

}
