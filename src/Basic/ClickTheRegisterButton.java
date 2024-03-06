package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickTheRegisterButton {
public static void main(String[] args) {
	String given_url="https://demowebshop.tricentis.com/";
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into DWS
	driver.navigate().to("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equalsIgnoreCase(current_url)) {
		System.out.println("iam in DWS page");
//		WebElement element = driver.findElement(By.className("ico-register"));
//		element.click();
		//driver.findElement(By.tagName("span")).click();
	}
	else
		System.out.println("iam not in Dws Page");
}
}

