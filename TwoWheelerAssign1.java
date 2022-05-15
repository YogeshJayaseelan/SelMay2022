package week1.day1;

public class TwoWheelerAssign1 {
	
	int noOfWheels = 2;
	short noOfMirros = 2;
	long chassisNumber = 434345542335L;
	boolean isPunctured = false;
	String bikeName = "Honda";
	double runningKm = 6564.34;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	TwoWheelerAssign1 wheel = new TwoWheelerAssign1();
	System.out.println("My Bike Details");
	System.out.println("No of Wheels =" + wheel.noOfWheels);
	System.out.println("No of Mirros =" + wheel.noOfMirros);
	System.out.println("ChassisNumber =" + wheel.chassisNumber);
	System.out.println("Puntured or Not =" + wheel.isPunctured);
	System.out.println("Bike Name =" + wheel.bikeName);
	System.out.println("Kilometer Driven =" + wheel.runningKm);
	
	

	}

}
