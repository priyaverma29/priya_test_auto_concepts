package day10;

public class StaticExample {

	static int a=10; //static variable
	int b=20; //non-static variable
	
	static void met1() //static method
	{
		System.out.println("this is a static method");
	}
	
	void met2() //non-static method
	{
		System.out.println("this is m2 a non-static method");
	}
	
	void met() //non-static
	{
		System.out.println(a);
		System.out.println(b)  ;
		
		met1();
		met2();
	}
	
	/*public static void main(String[] args) {
		
		//static methods can access non-static stuff thru object
		
		System.out.println(a);
		
		//System.out.println(b); incorrect because b is non-static var  we can access via object.
		
		met1();
		//met2(); incorrect because met2 is non-static
		StaticExample se=new StaticExample();
		
		System.out.println(se.b);

		se.met2();
	}*/

}
