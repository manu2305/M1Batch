package Assingments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Princeclass {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://demoapp.skillrary.com/");
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement search = driver.findElement(By.xpath("//input[@class='form-control']"));
	js.executeScript("arguments[0].value='Ravi';", search);
}
}
