package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyByGetAttribute {
public static void main(String[] args) {
	String given_data="chota bheem";
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into Dws
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search_field = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
	search_field.sendKeys("chota bheem");
	String current_Data = search_field.getAttribute("value");
	if (given_data.equalsIgnoreCase(current_Data)) {
		System.out.println("dholakpur..... and Meena");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
	}
	else {
		System.out.println("tun tun mosikke laddu");
		driver.close();
	}
	
}
}
