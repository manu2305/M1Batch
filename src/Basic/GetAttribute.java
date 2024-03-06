package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
public static void main(String[] args) {
	String given_data="small-searchterms";
	WebDriver driver=new ChromeDriver();
	//maximize 
	driver.manage().window().maximize();
	//enter into Dws
	driver.get("https://demowebshop.tricentis.com/");
	WebElement search_field = driver.findElement(By.name("q"));
	String Current_data = search_field.getAttribute("id");
	if(given_data.equalsIgnoreCase(Current_data)) {
		System.out.println(Current_data);
		System.out.println("id is same");
		driver.close();
	}
	else
		System.out.println("id is not same....");
}
}
