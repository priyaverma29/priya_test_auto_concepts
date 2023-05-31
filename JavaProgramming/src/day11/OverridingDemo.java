package day11;

class Bank
{
	double roi()
	{
		return 0.0;
	}
}

class ICICI extends Bank
{
	double roi()
	{
		return 10.50;
	}
}

class AXIS extends Bank
{
	double roi()
	{
		return 12.50;
	}
} 


public class OverridingDemo {

	public static void main(String[] args) {
		ICICI ic = new ICICI();
		System.out.println(ic.roi());//10.50
		
		AXIS ax = new AXIS();
		System.out.println(ax.roi());//12.50
		
		Bank bk = new Bank();
		System.out.println(bk.roi()); //0.0
	}

}
