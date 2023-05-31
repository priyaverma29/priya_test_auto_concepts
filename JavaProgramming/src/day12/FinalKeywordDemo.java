package day12;

class Test
{
	final int x=100; //acts as constant
}

final class Test1
{
	final void method() 
	{
		System.out.println("this method1 is belongs to Test1 class...");
	}
}

/*class Test2 extends Test1 // incorrect test1 is final class 
{
	void method() // incorrect because method() is final method
	{
		System.out.println("this method1 is belongs to Test2 class...");
	}
}*/

public class FinalKeywordDemo {

	public static void main(String[] args) {
		Test t = new Test();
		//t.x=200; (incorrect because x is a final variable n we can't change it.
		
		System.out.println(t.x);

	}

}
