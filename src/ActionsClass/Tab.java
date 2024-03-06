package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize the browser
    driver.manage().window().maximize();
    driver.get("https://demowebshop.tricentis.com/");
//    Actions act = new Actions(driver);
//    act.keyDown(Keys.TAB).build().perform();
//    Thread.sleep(2000);
//    act.keyDown(Keys.TAB).build().perform();
//    Thread.sleep(2000);
//    act.keyDown(Keys.TAB).build().perform();
    WebElement text_field = driver.findElement(By.id("small-searchterms"));
    text_field.sendKeys("Manikandan");
    System.out.println(text_field.getAttribute("value"));
    
    
}
}
