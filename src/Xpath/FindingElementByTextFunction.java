package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElementByTextFunction {
public static void main(String[] args) {
	
	//open the browser
	ChromeDriver driver=new ChromeDriver();
    //maximize the browser
	driver.manage().window().maximize();
	//enter to browser
	driver.navigate().to("https://www.facebook.com/");
	WebElement given_button=driver.findElement(By.xpath("//a[text()='Create new account']"));
	if(given_button.isDisplayed()) {
		System.out.println("iam in faceBook");
		given_button.click();
		driver.close();
	}
	else
		System.out.println("iam not in faceBook page.....");
	
	
}
}
