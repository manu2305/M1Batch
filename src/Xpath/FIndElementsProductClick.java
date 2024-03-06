package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FIndElementsProductClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	List<WebElement> products = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
	for (WebElement pdt : products) {
		pdt.click();
		Thread.sleep(2000);
		driver.navigate().back();
	}
}
}
