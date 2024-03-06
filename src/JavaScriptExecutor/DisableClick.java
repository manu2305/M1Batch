package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableClick {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
	Thread.sleep(2000);
	JavascriptExecutor js=(JavascriptExecutor) driver;
	Thread.sleep(2000);
	WebElement window_installer = driver.findElement(By.xpath("//a[@data-lbl='lightbox-open-jdk-11.0.21_windows-x64_bin.exe']"));
	Thread.sleep(2000);
     js.executeScript("arguments[0].scrollIntoView(false)", window_installer);
     window_installer.click();
     Thread.sleep(2000);
     WebElement disable_button = driver.findElement(By.xpath("//a[text()='Download jdk-11.0.21_windows-x64_bin.exe']"));
     js.executeScript("arguments[0].click();",disable_button);
     
}
}
