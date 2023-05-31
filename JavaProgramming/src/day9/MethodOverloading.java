package day9;

public class MethodOverloading {
	
	int x,y;
	double d;
	
	void sum() //1
	{
		x=10;y=20;
		System.out.println(x+y);
	}
	
	void sum(int a,int b) //2
	{
		x=a;y=b;
		System.out.println(x+y);
	}
	
	void sum(int a, double b) //3
	{
		x=a;d=b;
		System.out.println(x+d);
	}
	
	void sum(double b,int a) //4
	{
		x=a;d=b;
		System.out.println(x+d);
	}

	public static void main(String[] args) 
	{
		MethodOverloading met= new MethodOverloading();
		
		met.sum(); //called 1
		
		met.sum(100,200); //called 2
		
		met.sum(25,25.08); //called 3
		
		met.sum(25.59,20); //called 4
		
	}

}
