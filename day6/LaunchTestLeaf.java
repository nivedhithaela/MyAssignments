package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchTestLeaf {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Abc");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Xyz");
		//Handling Drop-downs
		WebElement source=driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown1=new Select(source);
		dropDown1.selectByIndex(4);
		WebElement source1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropDown2=new Select(source1);
		dropDown2.selectByVisibleText("Automobile");
		
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle());
		
		
		
		
		
		
		
	}

}
