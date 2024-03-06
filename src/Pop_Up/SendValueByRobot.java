package Pop_Up;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendValueByRobot {
public static void main(String[] args) throws Exception {
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.navigate().to("https://demowebshop.tricentis.com/");
	Thread.sleep(2000);
	Robot rbt = new Robot();
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_TAB);
	Thread.sleep(2000);
	rbt.keyPress(KeyEvent.VK_CAPS_LOCK);
	rbt.keyPress(KeyEvent.VK_O);
	Thread.sleep(500);
	rbt.keyRelease(KeyEvent.VK_CAPS_LOCK);
	rbt.keyPress(KeyEvent.VK_R);
	Thread.sleep(500);
	rbt.keyPress(KeyEvent.VK_A);
	Thread.sleep(500);
	rbt.keyPress(KeyEvent.VK_N);
	Thread.sleep(500);
	rbt.keyPress(KeyEvent.VK_G);
	Thread.sleep(500);
	rbt.keyPress(KeyEvent.VK_E);
	Thread.sleep(500);
	
	rbt.keyRelease(KeyEvent.VK_TAB);
	rbt.keyRelease(KeyEvent.VK_O);
	rbt.keyRelease(KeyEvent.VK_R);
	rbt.keyRelease(KeyEvent.VK_A);
	rbt.keyRelease(KeyEvent.VK_N);
	rbt.keyRelease(KeyEvent.VK_G);
	rbt.keyRelease(KeyEvent.VK_E);
}
}























