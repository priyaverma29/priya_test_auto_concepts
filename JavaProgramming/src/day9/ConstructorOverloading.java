package day9;

public class ConstructorOverloading {
	int x,y;
	double d;
	
	ConstructorOverloading() //1
	{
		x=10;y=20;

	}
	
	ConstructorOverloading(int a, int b) //2
	{
		x=a;y=b;
		
	}
	ConstructorOverloading(int a, double b) //3
	{
		x=a;d=b;
		
	}
	
	ConstructorOverloading(double b, int a) //4
	{
		x=a;d=b;
		
	}
	
	void displaydata()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	

	public static void main(String[] args) {
		//ConstructorOverloading co=new ConstructorOverloading(); // called 1
		ConstructorOverloading co=new ConstructorOverloading(100,200); // called 2
		//ConstructorOverloading co=new ConstructorOverloading(200,678.99); // called 3
		//ConstructorOverloading co=new ConstructorOverloading(10.0,200); // called 4
		co.displaydata();

	}

}
