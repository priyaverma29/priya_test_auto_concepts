package day9;

public class ConstructorDemo {
	
	int x,y;
	String s;
	
	/*ConstructorDemo()//default Constructor
	{
		x=100;y=200;
		s="welcome";
	}*/
	
	ConstructorDemo(int a, int b, String str)//parameterize Constructor
	{
		x=a;y=b;s=str;
	}
	
	void displayData()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}
	

	public static void main(String[] args) 
	{
		//ConstructorDemo cd= new ConstructorDemo(); // invoking default constructor
		ConstructorDemo cd = new ConstructorDemo(10,40,"welcome");// invoking parameterized constructor
		cd.displayData();
	}

}
