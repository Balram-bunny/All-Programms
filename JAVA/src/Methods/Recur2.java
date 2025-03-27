package Methods;

public class Recur2 {
 int i=0;
  void m1()
 {
	 ++i;
	 if(i<=10) {
	 if(i%2==0)
	 {
		 System.out.println(i);
	 }
	 m1();

	 }
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recur2 rc=new Recur2();
		rc.m1();

	}

}
