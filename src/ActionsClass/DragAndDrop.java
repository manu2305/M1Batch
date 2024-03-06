package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) {
	//open the browser
			WebDriver driver=new ChromeDriver();
			//maximize the browser
			driver.manage().window().maximize();
			//enter into drag and drop page
			driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			WebElement source = driver.findElement(By.id("box6"));
			WebElement target = driver.findElement(By.xpath("//div[text()='Italy']"));
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
}
}
