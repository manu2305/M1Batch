package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenTextField {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into demo Dws
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/signup");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	WebElement custom = driver.findElement(By.xpath("//input[@name='custom_gender']"));
	js.executeScript("arguments[0].value='nandhi soi';",custom);	
}
}
