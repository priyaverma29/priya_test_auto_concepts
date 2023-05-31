package day12;

public class PQR extends MNO implements ABC,XYZ
{
	
	public static void main(String[] args) {
		PQR obj=new PQR();
		obj.m1();
		obj.m2();
		obj.m3();
	}

	public void m2() {
		System.out.println("this is m2 from XYZ interface");
		System.out.println(y);
	}

	public void m1() {
		System.out.println("this is m1 from ABC interface");
		System.out.println(x);
	}

}
