package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOnMultipleWindow {
public static void main(String[] args) throws InterruptedException {
	String dws="https://demowebshop.tricentis.com/";
	String facebook="https://www.facebook.com/nopCommerce";
	String twitter="https://twitter.com/nopCommerce";
	//open the browser
		WebDriver driver=new ChromeDriver();
		//maximize 
		driver.manage().window().maximize();
		//enter into demo Dws
		driver.get("https://demowebshop.tricentis.com/");
		Actions act=new Actions(driver);
		act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Twitter")).click();
		Set<String> eCommerce_link = driver.getWindowHandles();
		Thread.sleep(3000);
		for (String str : eCommerce_link) {
			driver.switchTo().window(str);
			String current_url = driver.getCurrentUrl();
			if(dws.equalsIgnoreCase(current_url)) {
				driver.findElement(By.id("small-searchterms")).sendKeys("laptop");
			}
			else if (facebook.equalsIgnoreCase(current_url)) {
				Thread.sleep(1000);
				driver.findElement(By.id(":rp:")).sendKeys("delhi poori Bhanth");
			}
			else {
				Thread.sleep(1000);
				driver.findElement(By.linkText("Create account")).click();
			}
			Thread.sleep(3000);
			
		}
}
}
