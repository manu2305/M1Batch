package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
public static void main(String[] args) {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into DWS
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.tagName("input")).sendKeys("phagal hey yea");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	driver.close();
}  
}
