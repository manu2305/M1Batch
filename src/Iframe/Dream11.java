package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dream11 {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.dream11.com/");
	Actions a=new Actions(driver);
	Thread.sleep(2000);
	a.keyDown(Keys.PAGE_DOWN).build().perform();
	Thread.sleep(2000);
//	driver.switchTo().frame(0);
	driver.switchTo().frame("send-sms-iframe");
	driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("7358001111");
}
}
