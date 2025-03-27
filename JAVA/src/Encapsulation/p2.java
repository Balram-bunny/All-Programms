package Encapsulation;

public class p2 {
	
	 private String college="VITAM";
	String rollno="14ME08";
	String name="Balram";

	public void set(String clg, String  rollno, String n)
	{
		college=clg;
		rollno=rollno;
		name=n;
	}
	public String get()
	{
		return college;
	}
	public String get1()
	{
		return rollno;
	}
	public String get2()
	{
		return name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p2 p=new p2();
		p.set("VITAM","14me08","Balram");
		System.out.println(p.get());
		System.out.println(p.get1());
		System.out.println(p.get2());

		

	}

}
