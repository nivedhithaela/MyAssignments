package Marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TataClique {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://www.tatacliq.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//MouseHover on Brands
		Actions mh=new Actions(driver);
		WebElement brands = driver.findElement(By.xpath("//div[@class='DesktopHeader__leftTabHolder']/div[2]"));
		mh.moveToElement(brands).perform();
		//MouseHover on Watch and Accessories
		WebElement watch = driver.findElement(By.xpath("//div[@class='DesktopHeader__brandLeftDetails']/div[5]"));
		mh.moveToElement(watch).perform();
		//Choose First Option from Features Brands
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		//New Arrivals Drop Down
		WebElement sort = driver.findElement(By.xpath("//select[@class='SelectBoxDesktop__hideSelect']"));
		Select dd=new Select(sort);
		dd.selectByVisibleText("New Arrivals");
		//Choosing Men Categories
		driver.findElement(By.xpath("(//div[@class='CheckBox__base'])[1]")).click();
		Thread.sleep(5000);
		//Retrieving Price
		List<WebElement> price = driver.findElements(By.xpath("//div[contains(@class,'ProductDescription__priceHolder')]/h3"));
		List<String> priceList=new ArrayList<String>();
		int price_size=price.size();
		System.out.println(price_size);
		for(int i=0;i<price_size;i++) {
			String list=price.get(i).getText();
			priceList.add(list);
		}
		System.out.println(priceList);
		//Choosing First Result
		driver.findElement(By.xpath("(//div[@class='PlpComponent__base'])[1]")).click();
		//WindowHandles
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		List<String> next=new ArrayList<String>(windowHandles);
		System.out.println(next);
		driver.switchTo().window(next.get(1));
		//Click Add to Bag
		WebElement addtobag = driver.findElement(By.xpath("//span[text()='ADD TO BAG']"));
		mh.scrollToElement(addtobag).perform();
		addtobag.click();
		//BagCount
		String cart_count = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("Cart Count is:"+cart_count);
		//Price
		String PDP_price = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3")).getText();
		String PDP = PDP_price.replaceAll("\\D", "");
		System.out.println(PDP);
		//Click Bag
		driver.findElement(By.xpath("//div[@class='DesktopHeader__myBagShow']")).click();
		String Cart_price = driver.findElement(By.xpath("//div[@class='CartItemForDesktop__informationTextWithBolder']")).getText();
		String Cart = Cart_price.replaceAll("\\D", "");
		System.out.println(Cart);
		if(Cart.contains(PDP)) {
			System.out.println("Price matched");
		}
		else {
			System.out.println("Price not matched");
		}
		//Screenshot
		WebElement cart_total = driver.findElement(By.xpath("//div[@class='CartPage__amountDetails']"));
		File source = cart_total.getScreenshotAs(OutputType.FILE);
		File destination=new File("./ScreenShots/tataclicque_cart.png");
		FileUtils.copyFile(source, destination);
		
		
       driver.quit();
	}

}
