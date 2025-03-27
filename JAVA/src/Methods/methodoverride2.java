package Methods;

public class methodoverride2 extends MethodOverride1 {
   void marry()
   {
	   System.out.println(" i am from sub class");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverride1 m=new methodoverride2();
		m.marry();

	}

}
