package week5.day1;

import java.awt.Desktop.Action;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class LegalEntitiesStatic extends LegalEntities{
	@Test
	public void createStaticLE() {
	
  
  driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Coke");
  driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
  driver.findElement(By.xpath("(//textarea[@part='textarea'])[2]")).sendKeys("Salesforces");
  
  
  WebElement element = driver.findElement(By.xpath("(//span[text()='--None--'])[1]"));
  driver.executeScript("arguments[0].click();",element);
  
  driver.findElement(By.xpath("//span[text()='Active']")).click();
  
  
  driver.findElement(By.xpath("//button[text()='Save']")).click();
 
//Verification of Legal Entity Name
		String text = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getText();
		System.out.println(text);

	}
}
