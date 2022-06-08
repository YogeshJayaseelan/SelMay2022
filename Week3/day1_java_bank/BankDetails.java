package Week3.day1_java_bank;

public class BankDetails {
	//saving(),fixed(),deposit()
	
	public void saving()
	{System.out.println("General guidelines for saving");}
	
	public void fixed()
	{System.out.println("General guildeline for fixed");}
	
	public void deposit(int amount)
	{System.out.println("General guideline for deposit "+amount);}
	
	public static void main(String[] args)
	{
		BankDetails b = new BankDetails();
	b.deposit(1000);
	}

}