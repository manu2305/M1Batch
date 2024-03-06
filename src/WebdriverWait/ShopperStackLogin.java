package WebdriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Basic.BaseClass1;

public class ShopperStackLogin extends BaseClass1 {
public static void main(String[] args) {
	preCondition1();
	driver.get("https://www.shoppersstack.com/");
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
	WebElement login_button = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn1")));
	login_button.click();
}
}
