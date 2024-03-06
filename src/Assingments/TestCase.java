package Assingments;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Basic.Webdriver1;

public class TestCase {
@Test(priority = 'A',dependsOnMethods = "nike",invocationCount = 2,threadPoolSize = 2,enabled = false)
public void dws() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	driver.close();
	
}
@Test(priority ='a',enabled = true)
public void nike() {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.nike.com/in/");
	driver.close();
}
}
