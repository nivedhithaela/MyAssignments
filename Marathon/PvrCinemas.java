package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class PvrCinemas {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Selecting Location
		driver.findElement(By.xpath("//span[@class='p-dropdown-label p-inputtext p-placeholder']//span")).click();
		driver.findElement(By.xpath("//h6[text()='Chennai']")).click();
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
		
		//Selecting Cinema,theatre,movie,date,time to book
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@data-pc-section='item']//span)[2]")).click();
		driver.findElement(By.xpath("//span[text()='Today']")).click();
		driver.findElement(By.xpath("//span[text()='PUSHPA(THE RULE PART-02)']")).click();
		driver.findElement(By.xpath("//span[text()='06:25 PM']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//selecting seats and retrieving price and seat number
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
		driver.findElement(By.xpath("//span[@id='CL.Club|L:1']")).click();
		String seat_number = driver.findElement(By.xpath("//div[@class='seat-number']")).getText();
		System.out.println("Seat Number is: "+seat_number);
		String grand_prices = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
		System.out.println("Grand Price is: "+grand_prices);
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
		System.out.println("Current Page Title is: "+driver.getTitle());
		
		driver.quit();
		
		
		
		
		
		
		

	}

}
