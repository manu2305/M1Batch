package Loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLearn {
public static void main(String[] args) throws InterruptedException {
	//open the browser
	ChromeDriver driver=new ChromeDriver();
    //maximize the browser
	driver.manage().window().maximize();
	//enter to browser
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.name("q")).sendKeys("juicy");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[type='submit']")).click();
}
}
