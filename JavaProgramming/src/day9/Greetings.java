package day9;

public class Greetings {
	//1 No params No return value
	void greeting1() 
	{
		 System.out.println("Hello...");
	}

	//2 No params Returns value
	String greetings2()
	{
		return "Hello, How are you?";
	}
	
	//3 takes params No return value
	void greetings3(String name)
	{
		System.out.println("Hello."+name);
	}
	
	//4 takes params and also return value
	String greetings4(String name)
	{
		return ("HEllo.."+name);
	}
	
}
