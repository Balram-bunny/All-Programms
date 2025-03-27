package Introduction;

public class Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     byte a=10;
     byte b=20;
     byte c= (byte) (a+b);// It is because, when operant is int and lower than int type then result will be of INT type.
     System.out.println(c);
     float d=10.0f;
     float e=20.0f;
     float f=d+e;
     System.out.println(f);// If both the operant wider than int type then result will be wider type
     final long g=10;
     byte h=(byte) g;
     System.out.println(g);
     System.out.println(h  );

     
	}

}
