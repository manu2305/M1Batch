package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableText {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into demo Dws
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	//Thread.sleep(2000);
	WebElement disable_textField = driver.findElement(By.xpath("//input[@class='form-control']"));
	js.executeScript("arguments[0].value='manikandan';", disable_textField);
	
}

}
