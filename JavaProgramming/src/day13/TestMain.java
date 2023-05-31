package day13;

//import java.beans.IntrospectionException;

public class TestMain {

	public static void main(String[] args) {
		
		Test t = new Test();
		System.out.println(t.x);
		t.m1();
	}
	
	
	public void m1() throws InterruptedException {
		Thread.sleep(100);
	}
	
	public void m2() throws Exception {
		try {
			m1();
		} catch(InterruptedException e) {
			throw new Exception("");
		}
		
	}
	
	public void m3() {
		//m2();
	}

}
