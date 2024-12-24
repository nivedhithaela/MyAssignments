package week5.day1;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LegalEntities {
	
	public ChromeDriver driver;
	
	@BeforeMethod
	@Parameters({"URL","Username","Password"})
	public void preconditions(String url,String username,String passwd) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Login Credentials
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(passwd);
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		//Scrolling down to choose Legal Entity from App Launcher
		Actions scroll=new Actions(driver);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		//driver.executeScript("arguments[0].click();",element);
	    scroll.scrollToElement(element).perform();
	    element.click();
	    Thread.sleep(5000);
	   WebElement element2= driver.findElement(By.xpath("//a[@title='Legal Entities']/following::one-app-nav-bar-item-dropdown//a"));
	   element2.click();
	     WebElement element3 = driver.findElement(By.xpath("//span[text()='New Legal Entity']"));
	    driver.executeScript("arguments[0].click();",element3);
	}
	@AfterMethod
	public void postConditions() {
		driver.quit();
		

	  
	  
	}
	
	

}
