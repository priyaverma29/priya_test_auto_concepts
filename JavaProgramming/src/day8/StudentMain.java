package day8;

public class StudentMain {

	public static void main(String[] args) {
		/*//Approach-1 by reference variable
		Student stu=new Student();
		stu.sid=101;
		stu.sname="Ankit";
		stu.grade='A';
		stu.show();
		
		//Approach-2 by creating method
		stu.SetData(102, "Shweta", 'B');
		stu.show();*/
		
		//Approach-3 by using constructor
		Student stu= new Student(103,"Shivaay",'A');
		stu.show();
}
	

}
