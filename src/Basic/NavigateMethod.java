package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	Thread.sleep(2000);
	driver.manage().window().maximize();
	//enter into the DemoWebShop
	Thread.sleep(2000);
	driver.navigate().to("https://demowebshop.tricentis.com/");
	driver.navigate().back();
	driver.navigate().forward();
	Thread.sleep(2000);
	driver.navigate().refresh();
	
}
}
