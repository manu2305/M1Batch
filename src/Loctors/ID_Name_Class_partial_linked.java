package Loctors;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID_Name_Class_partial_linked {
public static void main(String[] args) {
	//open the browser
			ChromeDriver driver=new ChromeDriver();
		    //maximize the browser
			driver.manage().window().maximize();
			//enter to browser
			driver.navigate().to("https://demowebshop.tricentis.com/");
			//driver.findElement(By.className("ico-register")).click();
			driver.findElement(By.name("q")).sendKeys("juicy");
			//driver.findElement(By.id("small-searchterms")).sendKeys("sugandh");
			driver.findElement(By.linkText("Register")).click();
			String text = driver.findElement(By.className("footer-disclaimer")).getText();
			System.out.println(text);
			
			
			
}
}
