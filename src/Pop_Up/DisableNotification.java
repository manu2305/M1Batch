package Pop_Up;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DisableNotification {
public static void main(String[] args) {
	ChromeOptions ch_options = new ChromeOptions();
	ch_options.addArguments("--disable-notifications");
	//open the browser
		WebDriver driver=new ChromeDriver(ch_options);
		//maximize
		driver.manage().window().maximize();
		driver.navigate().to("https://www.easemytrip.com/");
		
}
}
