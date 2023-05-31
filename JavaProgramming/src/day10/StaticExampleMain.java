package day10;

public class StaticExampleMain {
	
public static void main(String[] args) {
		
		//static methods can access non-static stuff thru object
		
		System.out.println(StaticExample.a);
		
		//System.out.println(b); incorrect because b is non-static var  we can access via object.
		
		StaticExample.met1();
		//met2(); incorrect because met2 is non-static
		StaticExample se=new StaticExample();
		
		System.out.println(se.b);

		se.met2();
	}


}
