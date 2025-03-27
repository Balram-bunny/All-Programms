package Encapsulation;

public class p1 {
     private String name;//  data hiding
   private  int rollno=10 ;
   private String gender;
   public void set(String n, int rollno, String gender)// data abstraction
   {
	   name=n;
	   this.rollno=rollno;
	   this.gender=gender;
   }
   public String get()
   {
	   return name;
   }
   public int get1()
   {
	   return rollno;
   }
   public String get2()
   {
	   return gender;
   }
     
   public static void main(String[] args) {
		// TODO Auto-generated method stub
	   p1 p=new p1();
	   p.set("Balram", 8, "Male");
	   System.out.println(p.get());
	   System.out.println(p.get1());
	   System.out.println(p.get2());


	}

}
