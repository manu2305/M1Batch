package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNameLocator {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into DWS
	driver.navigate().to("https://demowebshop.tricentis.com/");
	//driver.findElement(By.name("q")).sendKeys("ambani");	
	//driver.findElement(By.id("small-searchterms")).sendKeys("mani");
	//driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.partialLinkText("Shopping")).click();

}
}
