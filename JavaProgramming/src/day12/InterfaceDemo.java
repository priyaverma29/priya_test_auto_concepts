package day12;

interface Shape 
{
	int length =10; //by default Final or static variable
	int width = 20; //by default Final or static variable
	
	void circle();
	default void square() //default method as Interface can have either default or static methods
	{
		System.out.println("this is Default one- Sqaure class");
	}
	
	static void rectangle() //static method
	{
		System.out.println("this is Static one- Sqaure class");
	}
}



public class InterfaceDemo implements Shape
{
	public void circle()
	{
		System.out.println("this is Abstract circle class");
	}
	
	public static void main(String[] args) 
	{
		InterfaceDemo intObj=new InterfaceDemo();
		intObj.circle();
		intObj.square();
		Shape.rectangle();
		
		
		//another way 
		
		Shape sh= new InterfaceDemo();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
	}

}
