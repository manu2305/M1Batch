package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CalenderPopUpEasyMyTrip {
public static void main(String[] args) throws InterruptedException {
	ChromeOptions ch_options=new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	WebDriver driver=new ChromeDriver(ch_options);
	//maximize
	driver.manage().window().maximize();
	driver.navigate().to("https://www.easemytrip.com/");
	Thread.sleep(2000);
	driver.findElement(By.id("dvfarecal")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("fiv_0_25/02/2024")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("divRtnCal")).click();
	Thread.sleep(2000);
	Thread.sleep(2000);
	for(;;) {
	try {
		driver.findElement(By.id("frth_6_25/05/2024")).click();
		System.out.println("my script is successfull....");
		break;
	} catch (Exception e) {
		driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
	}
	}
	
}
}
