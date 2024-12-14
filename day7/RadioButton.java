package week3.day1;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		//Favourite bowser
		driver.findElement(By.xpath("//h5[text()='Your most favorite browser']/following::div/div/table/tbody/tr[1]/td[1]/div")).click();
		//Unselectable
		driver.findElement(By.xpath("//input[@value='Chennai']/following::div[1]/span")).click();
		driver.findElement(By.xpath("//input[@value='Chennai']/following::div[1]/span")).click();
		boolean city_enabled = driver.findElement(By.xpath("//input[@value='Chennai']/following::div[1]/span")).isEnabled();
		System.out.println("Is City Enabled:"+city_enabled);
		boolean city_selected = driver.findElement(By.xpath("//input[@value='Chennai']")).isSelected();
		System.out.println("Is City Selected:"+city_selected);
		//Default Radio Button
		String text = driver.findElement(By.xpath("//input[@value='Option3']//following::label[1]")).getText();
		System.out.println("Default browser chosen is:"+text);
		boolean default_value = driver.findElement(By.xpath("//input[@value='Option3']")).isSelected();
		System.out.println("Is Default browser selected:"+default_value);
		driver.findElement(By.xpath("//input[@value='Option2']/following::div[1]")).click();
		boolean default_value1=driver.findElement(By.xpath("//input[@value='Option3']")).isSelected();
		System.out.println("Is Default browser selected:"+default_value1);
		//Age limit selection
		driver.findElement(By.xpath("//input[@id='j_idt87:age:0']/following::div[1]")).click();
		WebElement age = driver.findElement(By.xpath("//input[@id='j_idt87:age:1']"));
		if(age.isSelected()) {
			System.out.println("The age group 21-40 Years is already Selected");
		}
		else {
			driver.findElement(By.xpath("//input[@id='j_idt87:age:1']/following::div[1]")).click();
			System.out.println("The age group 21-40 Years is now Selected");
		}
		
		
		
		

	}

}
