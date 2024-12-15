package week4.day2;

import java.time.Duration;
import java.util.ArrayList;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://erail.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		WebElement from = driver.findElement(By.xpath("//input[@placeholder='From Station']"));
		from.clear();
		from.sendKeys("MAS",Keys.ENTER);
		
		WebElement to = driver.findElement(By.xpath("//input[@placeholder='To Station']"));
		to.clear();
		to.sendKeys("MDU",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		//Locating Table
		WebElement table = driver.findElement(By.xpath("//div[@id='divMainWrapper']//div/div/table[1]/tbody"));
		//Retrieving Train names
		List<WebElement> tl = table.findElements(By.xpath("//div[@id='divMainWrapper']//div/div/table[1]/tbody/tr/td[2]"));
		int train_size=tl.size();
		System.out.println("No of Trains:"+train_size);
		System.out.println("Train List is:");
		List<String> train_list=new ArrayList<String>();
		for(int i=0;i<train_size;i++) {
			String train_names=tl.get(i).getText();
			train_list.add(train_names);
			}
		System.out.println(train_list);
		//Finding dupilicates
		Set<String> train_dup=new LinkedHashSet<String>(train_list);
		if(train_list.size()==train_dup.size()) {
			System.out.println("No Duplicates in Train Names");
		}
		else {
			System.out.println("Duplicates found in Train Names");
		}
		
	//Close the browser
		driver.close();
	}
	
				
				
	}


	
		
		
		  
	
		
		
		

	


