package Introduction;

public class LV {
    static int a=10;
    int d=12;
    void fun()
    {
    	int b=10;
    	
    	System.out.println(a + " "+ b);
    	++a; ++b;
    }
	public static void main(String[] args) {
		LV l=new LV();
		l.fun();
		l.fun();
		l.fun();
		final int C=10;
	 System.out.println(C);
	 
		}

}

/* this is because local variable can be accessed within that block only result that, when fun method called first time it create a memory
 * for static & local variable both so it print 10 10 for the first time , when we call second time same memory called for static but forlocal variable
 * the memory got deleted and new memory created for that block again so it print 11 10  */
 