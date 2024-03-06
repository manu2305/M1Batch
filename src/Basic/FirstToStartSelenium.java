package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstToStartSelenium {
public static void main(String[] mani ) {
	String given_url="https://demowebshop.tricentis.com/";
	//open the browser
	//ChromeDriver driver = new ChromeDriver();
	WebDriver driver=new ChromeDriver();
	//maximize the Browser
	driver.manage().window().maximize();
	//enter into the DemoWebShop
	driver.get("https://demowebshop.tricentis.com/");
	String current_url = driver.getCurrentUrl();
	if(given_url.equalsIgnoreCase(current_url)) {
		System.out.println("iam in a DWS Website");
	}
	else
		System.out.println("iam not in Dws WebSite");
	//close the browser
	driver.close();
}
}
