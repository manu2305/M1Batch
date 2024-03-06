package Assingments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Harman_dragAnddrop {

	public static void main(String[] args) throws InterruptedException {
		//open the browser
				WebDriver driver=new ChromeDriver();
		//maximize the browser
				driver.manage().window().maximize();
		//enter into Register page
				driver.navigate().to("https://demo.automationtesting.in/Register.html");
				Thread.sleep(2000);
	  driver.findElement(By.xpath("//a[contains(text(),'Interactions')]")).click();
	  WebElement intractions_option = driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[3]"));
	 if(intractions_option.isEnabled())
	 {
		WebElement drag_drop = driver.findElement(By.xpath("(//ul[@class='dropdown-menu'])[3]/li/a"));
	  WebElement Static = driver.findElement(By.xpath("//a[contains(text(),'Static')]"));
		Actions act=new Actions(driver);
	    act.clickAndHold(drag_drop).click(Static).build().perform();
	    Thread.sleep(2000);
	 }
	 else
		 System.out.println("");
	 WebElement s_name = driver.findElement(By.id("angular"));
	 WebElement droparea = driver.findElement(By.xpath("//div[@id='dragarea']/div"));
	 Actions act1=new Actions(driver);
	 act1.keyDown(Keys.PAGE_DOWN).build().perform();
	 Thread.sleep(2000);
	 act1.dragAndDrop(s_name,droparea).build().perform();
//	 Thread.sleep(2000);
//	 act1.dragAndDrop(s_name,droparea).build().perform();
//	 Thread.sleep(2000);
//	 act1.dragAndDrop(s_name,droparea).build().perform();
	
	
	
	
		}

}
