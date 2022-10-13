package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead{

public static void main(String[] args) 
{
	
	//step 1:setup the driver/connect webdriver
		WebDriverManager.chromedriver().setup();
		//step 2: create an instance to browser
		ChromeDriver driver =new ChromeDriver();
		//step 3:open url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//step 4:maximize the window
		driver.manage().window().maximize();
		//step 5:ENTER USERNAME and password
	   driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click on login button using class locator
		driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		//click on create lead
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter CompanyName field using locator
 ((WebElement) driver.findElements(By.name("createLeadForm_Company Name"))).sendKeys("Testleaf");
		//enter first name
		driver.findElement(By.id("createLeadForm_First Name")).sendKeys("Nimna");
		//enter last na driver.findElements(By.id("createLeadForm_Last Name"))).sendKeys("Preman");
		//enter first name using local using id locator
		driver.findElement(By.id("createLeadForm_First Name local")).sendKeys("Nimmy");
		//enter department field using locator of your choice
		driver.findElement(By.id("createLeadForm_Department field")).sendKeys("Selenium Webdriver");
		driver.findElement(By.name("description")).sendKeys("This is Testleaf dept");
  ((WebElement) driver.findElements(By.id("createLeadForm_primarymailid"))).sendKeys("nimnav6@gmail.com");
            driver.findElement (By.className("small Submit")).click();
		 
		((WebElement) driver.findElements(By.className("createbutton"))).click();
		String title=driver.getTitle();
		System.out.println(title);
	((WebElement) driver.findElements(By.linkText("Duplicate Lead"))).click();
	driver.findElements(By.id("create LeadForm_companyName")).clear();
	((WebElement) driver.findElements(By.id("create LeadForm_companyName"))).sendKeys("Wipro");
	driver.findElements(By.id("create LeadForm_FirstName")).clear();
	((WebElement) driver.findElements(By.id("create LeadForm_FirstName"))).sendKeys("Nimna");
	driver.findElement(By.className("small Submit")).click();
	String title1=driver.getTitle();
	System.out.println(title1);
	
}
}

