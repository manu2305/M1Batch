package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebElement {
public static void main(String[] args) throws IOException {
	LocalDateTime ldt = LocalDateTime.now();
	String date = ldt.toString().replace(":", "-");
	System.out.println(date);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	driver.get("https://twitter.com/RealHughJackman?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor");
	org.openqa.selenium.WebElement hugh_jackman = driver.findElement(By.xpath("//div[@data-testid='UserAvatar-Container-RealHughJackman']"));
	File from = hugh_jackman.getScreenshotAs(OutputType.FILE);
	File to=new File("C:\\Users\\QSP1\\Pictures\\Screenshots\\wolvarine"+date+".png");
	FileHandler.copy(from, to);
	
	
}
}
