package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTheNotificationPop {
public static void main(String[] args) throws InterruptedException, AWTException {
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.navigate().to("https://www.easemytrip.com/");
	Thread.sleep(4000);
	Robot rbt = new Robot();
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_ENTER);
	rbt.keyRelease(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_ENTER);
	
}
}
