package singleLevelInheritence;

public class p2 extends p1 {
    int a=20;
    
	public static void main(String[] args) {
		p2 p=new p2();
		System.out.println(p.a);
		m1();
		System.out.println(p1.a);
		String s="110";
		int a=Integer.parseInt(s);
		System.out.println(a);
		double b=Double.parseDouble(s);
		System.out.println(b);
		boolean c=Boolean.parseBoolean(s);
		System.out.println(c);
		int d=10;
		String s1=String.valueOf(d);
		System.out.println(s1);
		
		

	}

}
