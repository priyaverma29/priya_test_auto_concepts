package day11;

class ParentNew
{
	void m1(int a) {
		System.out.println(a);
	}
	void m2(int b) {
		System.out.println(b);
	}
}

class ChildNew extends ParentNew
{
	void m1(int a) //Override method
	{
		System.out.println(a*a);
	}
	void m2(int a,int b) // Overloaded method
	{
		System.out.println(a+b);
	}
}


public class OverridingVsOverloading {

	public static void main(String[] args) {
		ParentNew par=new ParentNew();
		par.m1(40);
		
		ChildNew ch = new ChildNew();
		ch.m2(10, 20);

	}

}
