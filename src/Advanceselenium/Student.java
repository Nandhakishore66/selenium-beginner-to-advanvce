package Advanceselenium;

public class Student {
	
	String student_Name;
	
	Student(String name){
		student_Name=name;
		System.out.println(name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student= new Student("Naveen");
		

	}

}
