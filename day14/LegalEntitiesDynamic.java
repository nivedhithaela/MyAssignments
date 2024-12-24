package week5.day1;


import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LegalEntitiesDynamic extends LegalEntities {
	@DataProvider (name="fetchData")
	public String[][] sendData(){
		String[][] data=new String[1][1];
		data[0][0]="Salesforce Automation by Nivedhitha";
		
		return data;
	}
	
	
	
	
	
	@Test(dataProvider = "fetchData")
	public void dynamicLE(String name) {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys(name);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		  //Verification of Legal Entity Name
		String text = driver.findElement(By.xpath("(//a[@class='forceActionLink']/div)[2]")).getText();
		System.out.println(text);
		  
		  }
		
	}


