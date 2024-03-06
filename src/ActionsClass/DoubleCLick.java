package ActionsClass;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.netty.handler.timeout.TimeoutException;

public class DoubleCLick {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize the browser
	driver.manage().window().maximize();
	//enter into guru99
	driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement double_click = driver.findElement(By.cssSelector("button[ondblclick='myFunction()']"));
	Actions act = new Actions(driver);
//	act.moveToElement(double_click).build().perform();
	Thread.sleep(2000);
	act.doubleClick(double_click).build().perform();
//	act.moveToElement(double_click).build().perform();
//	act.doubleClick().build().perform();
	Thread.sleep(2000);
	try {
		act.doubleClick(double_click).build().perform();
		System.out.println("is Unsuccessfull");
	} catch (UnhandledAlertException e) {
		System.out.println("my script is successfull");
	}
	
	
	
//	
}
}

