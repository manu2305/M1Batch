package Pop_Up;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopUp {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	//maximize
	driver.manage().window().maximize();
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='file']")).sendKeys("D:\\Selenium\\XpathNotesPdf.pdf");
	
}
}

