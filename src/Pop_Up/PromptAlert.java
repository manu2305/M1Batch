package Pop_Up;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into demo Dws
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.linkText("Alert with Textbox")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
	Alert alt = driver.switchTo().alert();
	alt.sendKeys("Aditi tripathi");
	alt.accept();
}
}
