package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsWebDriver {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/waits.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
		//Clickability
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		
		WebElement second_button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		WebElement element = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt96']"));
		driver.executeScript("arguments[0].click();",element);
		boolean enabled = second_button.isEnabled();
		System.out.println("Second Button is enabled:"+enabled);
		//Text Change
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		String text = driver.findElement(By.xpath("//button[@name='j_idt87:j_idt99']")).getText();
		System.out.println(text);
		 WebElement until2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Did you notice?']")));
		 System.out.println(until2.getText());
		 
		 //Close Browser
		 driver.close();

	}
	
}
