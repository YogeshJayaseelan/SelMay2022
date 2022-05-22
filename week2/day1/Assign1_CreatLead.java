package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Assign1_CreatLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");

		//Maximime the window screen

		driver.manage().window().maximize();

		//Enter username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		
		//Choose Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter comp name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf002");
		
		//Enter fist name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Yogesh");
		
		//Enter last name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("J");
		
		//Enter firstname local
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Leaf");
		
		//Enter dept
		driver.findElement(By.className("inputBox")).sendKeys("Dept");
		
		//Enter desp
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Desp");
		
		//Enter Email
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("testleaf@gmail.com");

		
		//State/Province dropdown ad newyork
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));

		Select elem = new Select(ele);
		elem.selectByVisibleText("New York");

		driver.findElement(By.name("submitButton")).click();
		System.out.println("The Title is= " +driver.getTitle());
		driver.close();

	}

}