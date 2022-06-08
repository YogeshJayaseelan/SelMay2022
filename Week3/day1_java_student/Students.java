package Week3.day1_java_student;

public class Students {

	public void getStudentInfo(int id)
	{System.out.println("The student id is: "+id);}
	
	public void getStudentInfor(int id, String name)
	{System.out.println("The student info "+id+" "+name);}
	
	public void getStudentInfo(String email, int phoneNo)
	{System.out.println("The student info "+email+" "+phoneNo);}
	
	public static void main(String[] args) {
		Students s = new Students();
		s.getStudentInfo(10);
		s.getStudentInfo("am@gmail.com", 12345);
		s.getStudentInfor(21, "Amr");

	}

}