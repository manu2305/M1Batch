package Presentation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	//attribute
//	driver.findElement(By.xpath("//a[@href='/login']")).click();
	//text()
//	driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
	
}
}
