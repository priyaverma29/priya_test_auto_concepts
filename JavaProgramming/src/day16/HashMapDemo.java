package day16;
import java.util.Map;
import java.util.Objects;
import java.util.HashMap;

class Employee
{
	int empid;
	String empname;
	
	
	
}

public class HashMapDemo {

	public static void main(String[] args) {
		Employee emp1 = new Employee();
		emp1.empid = 101;
		emp1.empname = "Priya";
		
		Employee emp2 = new Employee();
		emp2.empid = 102;
		emp2.empname = "Ankit";
		
		Employee emp3 = new Employee();
		emp3.empid = 102;
		emp3.empname = "Ankit";
		
		
		//System.out.println(emp1.empid + "  "+ emp1.empname);
		//System.out.println(emp2.empid + "  "+ emp2.empname);
		
		Map hmap= new HashMap();
		/*
		hmap.put(1, "Shweta");
		hmap.put(2, "Satvik");
		hmap.put(3, "Krishav");
		hmap.put(3, "Kanha");
		*/
		hmap.put(emp1, "employee1");
		hmap.put(emp2, "employee2");
		
		
		System.out.println(hmap.get(emp3));
		System.out.println(hmap.get(emp2));
	
		
	}

}
