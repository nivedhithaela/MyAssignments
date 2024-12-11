package week3.day1;

import java.time.Duration;


import org.openqa.selenium.By;


import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		//Basic and Notification Checkbox
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectbooleancheckbox ui-chkbox')]//div)[2]")).click();
		driver.findElement(By.xpath("//div[@id='j_idt87:j_idt91']/div[2]")).click();
		String verify_message = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(verify_message);
		//Favourite Language
		driver.findElement(By.xpath("(//div[@class='ui-chkbox ui-widget']//div)[2]")).click();
		//Tri-state
		driver.findElement(By.xpath("//div[@data-iconstates='[\"\",\"ui-icon ui-icon-check\",\"ui-icon ui-icon-closethick\"]']")).click();
		String option = driver.findElement(By.xpath("//p[text()='State = 1']")).getText();
		System.out.println(option);
		//Toggle Option
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		String toggle_option = driver.findElement(By.xpath("//span[text()='Checked']")).getText();
		System.out.println(toggle_option);
		//Checkbox disabled
		boolean status = driver.findElement(By.xpath("//input[@disabled='disabled']")).isEnabled();
		System.out.println(status);
		//Multiple options
		driver.findElement(By.xpath("//ul[@data-label='Cities']")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[1]/div/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[2]/div/div[2]")).click();
		driver.findElement(By.xpath("//div[@class='ui-selectcheckboxmenu-items-wrapper']//li[3]/div/div[2]")).click();
		String cities = driver.findElement(By.xpath("//ul[@data-label='Cities']")).getText();
		System.out.println("Selected Cities:");
		System.out.println(cities);
		
	//Close browser
		driver.close();
		

		
		
	    
		
		
		
	}

}
