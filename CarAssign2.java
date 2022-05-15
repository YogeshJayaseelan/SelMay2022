package week1.day1;

public class CarAssign2 {
	
	public void applyBreak() {
		System.out.println("Please Apply Break");
	}
	
	
	public void applyGear() {
		System.out.println("Please Apply Gear");
	}
	
	public void switchOnAc() {
		System.out.println("Please Switch on AC");
	}
	
	public void applyAcclerate() {
		System.out.println("Please Apply Accelerate");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarAssign2 mycar = new CarAssign2();
		mycar.applyAcclerate();
		mycar.applyGear();
		mycar.applyAcclerate();
		mycar.applyBreak();
		mycar.switchOnAc();

	}

}
