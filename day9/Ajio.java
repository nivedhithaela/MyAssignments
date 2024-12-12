package week3.day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(5000);
		String items_count = driver.findElement(By.xpath("//div[@class=' filter-container']//div/strong")).getText();
		System.out.println(items_count);
		
		driver.findElement(By.xpath("//span[text()='brands']")).click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@aria-label='brands']//following::div/ul/li//label"));
		int brand_size=elements.size();
		System.out.println("'/b'No of Brand:'/b'"+brand_size);
		System.out.println("Brands List are:");
		for(int i=0;i<brand_size;i++) {
			String text = elements.get(i).getText();
			System.out.println(text);
		}
		driver.findElement(By.xpath("//label[@for='ADIDAS']")).click();
		Thread.sleep(5000);
		
		List<WebElement> bagname = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int bagname_size=bagname.size();
		System.out.println("Adidas bags quantity:"+bagname_size);
		System.out.println("Adidas bag names are:");
		for(int i=0;i<bagname_size;i++) {
			String text1 = bagname.get(i).getText();
			System.out.println(text1);
		}
		

	}

}
