package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']/span")).click();
		//Get Title
		String title = driver.getTitle();
		System.out.println(title);
		//Back command
		driver.navigate().back();
		//Check Enabled
		boolean enabled = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.out.println(enabled);
		//Get Location
		Point location = driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		System.out.println(location);
		//Get Background color
		String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println(cssValue);
		//Getting size
		Dimension size = driver.findElement(By.xpath("//h5[text()='Find the height and width of this button']")).getSize();
		System.out.println(size);
		//Close Browser
		driver.close();

	}

}
