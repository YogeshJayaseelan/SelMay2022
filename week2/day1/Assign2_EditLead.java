package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assign2_EditLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Setup Chrome Driver
		WebDriverManager.chromedriver().setup();

		//open the browser
		ChromeDriver driver= new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

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

		
		//Click on submit button
		driver.findElement(By.name("submitButton")).click();
	
		
		//Click on Edit button
		driver.findElement(By.linkText("Edit")).click();
		
		//Clear the description
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		//Fill imp details
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Imp Details");
		
		//Click on submit
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get Title
		System.out.println("The Title is= " +driver.getTitle());
		driver.close();


	}

}