package Basic;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetWindowHandle {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into Dws
	driver.get("https://demowebshop.tricentis.com/");
	String dws_handle = driver.getWindowHandle();
	System.out.println(dws_handle);
	List<WebElement> products = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
	Actions act=new Actions(driver);
	for (WebElement web : products) {
		act.keyDown(Keys.CONTROL).click(web).build().perform();
	}
	Set<String> Multiple_window = driver.getWindowHandles();
	System.out.println(Multiple_window);
}
}
