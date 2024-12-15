package week4.day2;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Actions scroll=new Actions(driver);
		WebElement element = driver.findElement(By.linkText("Conditions of Use & Sale"));
		scroll.scrollToElement(element).perform();
		System.out.println(element.getText());
		element.click();
		//Screenshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination=new File("./ScreenShots/amazon.png");
		FileUtils.copyFile(source, destination);
		
		

	}

}
