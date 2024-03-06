package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class independentAndDependent {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/digital-downloads");
	WebElement music_price = driver.findElement(By.xpath("(//a[text()='Music 2'])[1]/../../div[3]/div/span"));
	System.out.println(music_price.getText());
}
}
