package week1.day1;

public class Mobile {
	
	public void MakeCall() {
		System.out.println("Please make a call");
	}

	public void SendMessage() {
		System.out.println("Please send a message");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("You are under a Main Method");
		Mobile action1 = new Mobile();
		action1.SendMessage();
		
		Mobile action2 = new Mobile();
		action2.MakeCall();

	}

}
