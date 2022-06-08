package Week3.day1_java_bank;

public class Axis extends BankDetails{
	
	public void deposit(int amount)
	{System.out.println("Axis guidelines for deposit "+amount);}

	public static void main(String[] args) {
		Axis a = new Axis();
		a.deposit(1000);
		a.fixed();
		a.saving();

	}

}