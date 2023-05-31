package day9;

public class ThisKeyword {
	
	int x,y; // x,y Class variable or instance variable
	
	/*void SetData(int x, int y) //a,b are local variable
	{
		this.x=x;
		this.y=y;
	}*/
	ThisKeyword(int x, int y) //a,b are local variable
	{
		this.x=x;
		this.y=y;
	}
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		
	}

	public static void main(String[] args) 
	{
		ThisKeyword th = new ThisKeyword(10,20);
		//th.SetData(10, 40);
		th.display();
	}

}
