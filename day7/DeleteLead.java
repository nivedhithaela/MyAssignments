package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//Enter Credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("320");
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("7687654356");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		String leadid = driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=16093']")).getText();
		System.out.println(leadid);
		driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=16093']")).click();
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("16093");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		driver.close();
		
		
		
		
		
		
		

	}

}
