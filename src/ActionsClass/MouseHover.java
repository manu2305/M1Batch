package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into Myntra webpage
	driver.navigate().to("https://www.myntra.com/");
	WebElement kids = driver.findElement(By.xpath("//a[text()='Kids']"));
	Actions a_ref = new Actions(driver);
	Thread.sleep(2000);
	a_ref.moveToElement(kids).build().perform();Thread.sleep(2000);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-reactid='345']")).click();
	Thread.sleep(2000);
	WebElement search_field = driver.findElement(By.className("desktop-searchBar"));
     a_ref.moveToElement(search_field).build().perform();
     Thread.sleep(2000);
	a_ref.click().build().perform();
	}
}
