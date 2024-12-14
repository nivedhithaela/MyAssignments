package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;



public class AmazonShop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Search Product
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys",Keys.ARROW_DOWN,Keys.ENTER);
		//driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		
		//Retrievig Total items
		String results = driver.findElement(By.xpath("//span[contains(text(),'results')]")).getText();
		System.out.println("Total number of results: "+results);
		
		//Checkbox selection
		driver.findElement(By.xpath("//a[@aria-label='Apply the filter Safari to narrow results']//i[@class='a-icon a-icon-checkbox']")).click();
        driver.findElement(By.xpath("//a[@aria-label='Apply the filter Skybags to narrow results']//i[@class='a-icon a-icon-checkbox']")).click();
        
        //sort
        driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
        driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
        //driver.findElement(By.xpath("//img[@alt='Safari Form Plus Compact Formal Office Laptop Bag 15.6\"-17\", 2 Compartments, Luggage Trolley Sleeve, Front Pocket, Premium...']")).click();
        
        //Retrieving product details, amount and page title
        String product_info = driver.findElement(By.xpath("(//span[contains(@class,'a-size-base-plus a-color-base')])[2]")).getText();
        System.out.println("Product info is: "+product_info);
        String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
        System.out.println("Price is: "+price);
        String page_text = driver.findElement(By.className("nav-categ-image")).getAttribute("alt");
        System.out.println("Page Text is: "+page_text);
        
        System.out.println("Current Title is: "+driver.getTitle());
        
        //close browser
        driver.quit();
        




		

	}

}
