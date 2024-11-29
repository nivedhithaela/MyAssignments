package week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestLeaf {

	public static void main(String[] args) {
		//Launch Browser
		ChromeDriver driver=new ChromeDriver();
		//Get URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Maximize the Window
		driver.manage().window().maximize();
		//Enter Login credentials and Login
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		//Click CRM/SFA Link
		driver.findElement(By.xpath("//a[normalize-space()='CRM/SFA']")).click();
		//Select AccountsTab
		driver.findElement(By.linkText("Accounts")).click();
		//Create Account
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("AIMS");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Handling DropDown
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select dd1=new Select(industry);
		dd1.selectByVisibleText("Computer Software");
		
		WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
		Select dd2=new Select(ownership);
		dd2.selectByVisibleText("S-Corporation");
		
		WebElement source=driver.findElement(By.id("dataSourceId"));
		Select dd3=new Select(source);
		dd3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement mc=driver.findElement(By.id("marketingCampaignId"));
		Select dd4=new Select(mc);
		dd4.selectByIndex(6);
		
		WebElement sp=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dd5=new Select(sp);
		dd5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value='Create Account']")).click();
		
		WebElement accname=driver.findElement(By.xpath("/html/body/div[6]/div/div[2]/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[2]/span"));
		String text=accname.getText();
		System.out.println(text);
		if(text.contains("AIMS")) {
			System.out.println("Account name displayed Correctly");
		}
		else {
			System.out.println("Account name incorrect");
		}
		
		
		
		//driver.quit();
		
		
		}
		
		
		
		
		
		
		
		
		

	}


