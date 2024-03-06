package Assingments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GiftCart {
public static void main(String[] args) throws InterruptedException {
	String _given_url="https://demowebshop.tricentis.com/25-virtual-gift-card";
	String[] str= {"Manikandan","jmanikandan2305@gmail.com","mani","jmanikandan2305@gmail.com"};
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[value='Add to cart']")).click();
	Thread.sleep(5000);
	String current_url = driver.getCurrentUrl();
	if(_given_url.equalsIgnoreCase(current_url)) {
		System.out.println("iam in giftcard page");
		List<WebElement> gift_cart = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
		int i=0;
		for (WebElement web : gift_cart) {
			web.sendKeys(str[i++]);
		}
		driver.findElement(By.id("giftcard_2_Message")).sendKeys("prince is a goooooood boy");
		String giftCard_price = driver.findElement(By.xpath("(//div[@class=\"prices\"])[1]/div/span")).getText();
		System.out.println("gift card test value is :"+giftCard_price);
		WebElement qty = driver.findElement(By.id("addtocart_2_EnteredQuantity"));
		qty.clear();
		qty.sendKeys("2");
		driver.findElement(By.id("add-to-cart-button-2")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("cart-label")).click();
		WebElement verify_product = driver.findElement(By.xpath("//a[@class='product-name']"));
		if(verify_product.isDisplayed()) {
			System.out.println("your product is successfully added");
			WebElement check_box = driver.findElement(By.xpath("//input[@name='removefromcart']"));
			check_box.click();
			if(check_box.isSelected()) {
				System.out.println("check box is selected successfully");
				WebElement update_cart = driver.findElement(By.xpath("//input[@name='updatecart']"));
				if(update_cart.isEnabled()) {
					update_cart.click();
				}
				else {
					System.out.println("it is not enabled , pagal see the button and run");
					driver.close();
				}
			}
			else
				System.out.println("check box selection is unsuccessfull");
			
		}
		else
			System.out.println("adding the product is unsuccessfull");
		
	}
	else {
		System.out.println("iam not in gift card page");
		driver.close();
	}
}
}
