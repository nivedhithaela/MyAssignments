package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		System.out.println(cd.getTitle());
		cd.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		cd.findElement(By.id("pass")).sendKeys("Tuna@321");
		cd.findElement(By.name("login")).click();
		cd.findElement(By.linkText("Find your account and log in.")).click();
		cd.close();
	}

}
