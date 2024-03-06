package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into demo Dws
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.cssSelector("input[type='submit']")).click();
	Alert alt = driver.switchTo().alert();
	alt.accept();
	System.out.println("my script is successfull..... done done ");
}
}
