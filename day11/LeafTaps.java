package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Enter Credentials
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
		//From
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdFrom']//following::a")).click();
		//windowHandle
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1);
		//List
		List<String> fromaddress=new ArrayList<String>(windowHandles1);
		System.out.println(fromaddress);
		driver.switchTo().window(fromaddress.get(1));
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(fromaddress.get(0));
		//To
		driver.findElement(By.xpath("//table[@name='ComboBox_partyIdTo']//following::a")).click();
		//windowHandle
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
		//List
		List<String> toaddress=new ArrayList<String>(windowHandles2);
		System.out.println(toaddress);
		driver.switchTo().window(toaddress.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		driver.switchTo().window(toaddress.get(0));
		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
		//Alert
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.println(driver.getTitle());
		//Close Browser
		driver.close();
		
		

	}

}
