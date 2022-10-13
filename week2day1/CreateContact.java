package week2day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact{

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
		driver.findElement(By.linkText("contacts")).click();
		//click on create contact
		driver.findElement(By.linkText("Create contact")).click();
		String text = driver.findElement(By.id("firstNameField")).getText();
	((WebElement) driver.findElements(By.id("lastNameField"))).sendKeys("Preman");
            driver.findElement (By.className("small Submit")).click();
		
		String title=driver.getTitle();
		System.out.println("Name+BrowserTitle"+title);
		driver.close();
	}
		
		
		
		
	}
