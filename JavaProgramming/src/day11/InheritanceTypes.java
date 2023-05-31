package day11;

class A
{
	int a=100;
	void display()
	{
		System.out.println(a);
	}
}


class B extends A
{
	int b=200;
	void show()
	{
		System.out.println(b);
	}
	
}

class C extends B
{
	int c=30;
	void print()
	{
		System.out.println(c);
	}
}



public class InheritanceTypes {
	

	public static void main(String[] args) 
	{
		B bobj = new B();
		
		bobj.a = 500; 
		bobj.b = 400;
		
		bobj.display();
		bobj.show();
		
		C cobj=new C();
		 
		cobj.display();
		cobj.show();
		cobj.print();
	}
	

}
