package Basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsStudy {
public static void main(String[] args) throws InterruptedException {
	//open the browser
		ChromeDriver driver=new ChromeDriver();
	    //maximize the browser
		driver.manage().window().maximize();
		//enter to browser
		driver.navigate().to("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		List<WebElement> Community_poll = driver.findElements(By.cssSelector("input[type='radio']"));
		for (WebElement web : Community_poll) {
			web.click();
			Thread.sleep(2000);
		}
		
}
}
