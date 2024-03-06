package Pop_Up;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {
public static void main(String[] args) throws InterruptedException {
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
	String parent = driver.getWindowHandle();
	Set<String> ECommerce_Link = driver.getWindowHandles();
	ECommerce_Link.remove(parent);
	for (String str : ECommerce_Link) {
		driver.switchTo().window(str);
		driver.findElement(By.id(":rp:")).sendKeys("delhi poori Bhanth");
	}
	driver.findElement(By.id(":rp:")).sendKeys("delhi poori Bhanth");
}
}
