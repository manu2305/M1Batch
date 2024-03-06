package WebdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basic.BaseClass1;

public class FaceBookLogin extends BaseClass1 {
public static void main(String[] args) throws InterruptedException {
	preCondition1();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://www.facebook.com/");
	
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement create_account = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
	if(create_account.isDisplayed()) {
		System.out.println("create account button is displayed");
		create_account.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("kathik");
	}
	else {
		System.out.println("create account button is not displayed");
		postConditionClose();
	}
}
}
