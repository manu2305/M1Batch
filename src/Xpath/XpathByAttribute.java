package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	String given_title="Demo Web Shop. Shopping Cart";
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	Thread.sleep(5000);
	driver.findElement(By.className("cart-label")).click();
	Thread.sleep(2000);
	String Current_title = driver.getTitle();
	if(given_title.equalsIgnoreCase(Current_title)) {
		System.out.println("iam in shopping cart");
		WebElement laptop14 = driver.findElement(By.xpath("//a[@class='product-name']"));
		Thread.sleep(2000);
		if(laptop14.isDisplayed()) {
			System.out.println("your product is successfully added");
		}
		else
			System.out.println("adding product is unsuccessfull");
	}
	else
		System.out.println("iam not in Shopping cart");
	
}
}
