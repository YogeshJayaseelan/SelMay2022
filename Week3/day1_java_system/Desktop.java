package Week3.day1_java_system;

public class Desktop extends Computer {

	public void desktopSize()
	{System.out.println("Desktop size - Desktop class");}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopSize();
		d.computerModel();

	}

}