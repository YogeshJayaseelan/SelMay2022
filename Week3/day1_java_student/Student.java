package Week3.day1_java_student;

import Week3.day1_java_department.Department;

public class Student extends Department {
	
	public void studentName()
	{System.out.println("studentName - student package");}
	
	public void studentDept()
	{System.out.println("studentDept - student package");
	}
	
	public void studentId()
	{System.out.println("studentId - student package");}

	public static void main(String[] args) {
		//studentName(),studentDept(),studentId()
		
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentDept();
		s.studentId();
		s.studentName();
		
		

	}

}